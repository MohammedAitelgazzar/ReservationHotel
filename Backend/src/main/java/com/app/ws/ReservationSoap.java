package com.app.ws;

import java.util.Date;
import java.util.List;

import com.app.entities.Chambre;
import com.app.entities.Client;
import com.app.entities.Reservation;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dao.ReservationRepository;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;


@Component
@WebService(serviceName = "ReservationService")
@Transactional
public class ReservationSoap {

    @Autowired
    private ReservationRepository reservationRepository;


    @WebMethod
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    @WebMethod
    public Reservation getReservation(@WebParam(name = "id") Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Reservation createReservation(
            @WebParam(name = "preferences") String preferences,
            @WebParam(name = "clientId") Long clientId,
            @WebParam(name = "chambreId") Long chambreId
    ) {
        Client client = reservationRepository.findClientById(clientId);
        if (client == null) {
            throw new IllegalArgumentException("Client with ID " + clientId + " not found");
        }

        Chambre chambre = reservationRepository.findChambreById(chambreId);
        if (chambre == null) {
            throw new IllegalArgumentException("Chambre with ID " + chambreId + " not found");
        }

        Reservation reservation = new Reservation();
        reservation.setPreferences(preferences);
        reservation.setDateDebut(new Date());
        reservation.setDateFin(new Date());
        reservation.setClient(client);
        reservation.setChambre(chambre);

        return reservationRepository.save(reservation);
    }


    @WebMethod
    public boolean deleteReservation(@WebParam(name = "id") Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
