package com.app.controller;

import com.app.dao.ReservationRepository;
import com.app.entities.Reservation;
import com.app.grpc.stubs.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.stream.Collectors;

@GrpcService
public class ReservationGrpcServiceImpl extends ReservationGrpcServiceGrpc.ReservationGrpcServiceImplBase {

    @Autowired
    private ReservationRepository reservationRepository;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void getAllReservations(GetAllReservationsRequest request,
                                   StreamObserver<GetAllReservationsResponse> responseObserver) {
        try {
            var reservations = reservationRepository.findAll().stream()
                    .map(this::mapToGrpcReservation)
                    .collect(Collectors.toList());

            responseObserver.onNext(GetAllReservationsResponse.newBuilder()
                    .addAllReservations(reservations)
                    .build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Error fetching reservations: " + e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void getReservationById(GetReservationByIdRequest request,
                                   StreamObserver<GetReservationByIdResponse> responseObserver) {
        try {
            var reservation = reservationRepository.findById(request.getId())
                    .map(this::mapToGrpcReservation)
                    .orElse(null);

            if (reservation != null) {
                responseObserver.onNext(GetReservationByIdResponse.newBuilder()
                        .setReservation(reservation)
                        .build());
            } else {
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Reservation not found")
                        .asRuntimeException());
            }
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Error fetching reservation: " + e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void saveReservation(SaveReservationRequest request,
                                StreamObserver<SaveReservationResponse> responseObserver) {
        try {
            var grpcReservation = request.getReservation();
            var reservation = new Reservation();

            // Map fields from gRPC to entity
            if (grpcReservation.getId() != 0) {
                reservation.setId(grpcReservation.getId());
            }
            reservation.setPreferences(grpcReservation.getPreferences());
            reservation.setDateDebut(dateFormat.parse(grpcReservation.getDateDebut()));
            reservation.setDateFin(dateFormat.parse(grpcReservation.getDateFin()));

            // Set client and chambre
            reservation.setClient(reservationRepository.findClientById(grpcReservation.getClientId()));
            reservation.setChambre(reservationRepository.findChambreById(grpcReservation.getChambreId()));

            var savedReservation = reservationRepository.save(reservation);

            responseObserver.onNext(SaveReservationResponse.newBuilder()
                    .setReservation(mapToGrpcReservation(savedReservation))
                    .build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Error saving reservation: " + e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void deleteReservation(DeleteReservationRequest request,
                                  StreamObserver<DeleteReservationResponse> responseObserver) {
        try {
            if (reservationRepository.existsById(request.getId())) {
                reservationRepository.deleteById(request.getId());
                responseObserver.onNext(DeleteReservationResponse.newBuilder()
                        .setSuccess(true)
                        .setMessage("Reservation deleted successfully")
                        .build());
            } else {
                responseObserver.onNext(DeleteReservationResponse.newBuilder()
                        .setSuccess(false)
                        .setMessage("Reservation not found")
                        .build());
            }
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Error deleting reservation: " + e.getMessage())
                    .asRuntimeException());
        }
    }

    private com.app.grpc.stubs.Reservation mapToGrpcReservation(Reservation reservation) {
        return com.app.grpc.stubs.Reservation.newBuilder()
                .setId(reservation.getId())
                .setDateDebut(dateFormat.format(reservation.getDateDebut()))
                .setDateFin(dateFormat.format(reservation.getDateFin()))
                .setPreferences(reservation.getPreferences())
                .setClientId(reservation.getClient().getId())
                .setChambreId(reservation.getChambre().getId())
                .build();
    }
}