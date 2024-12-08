package com.app.ws;

import java.util.Date;
import java.util.List;

import com.app.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dao.ReservationRepository;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.transaction.annotation.Transactional;

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
    public Reservation createReservation(@WebParam(name = "reservation") String preferences)

    {

        Reservation reservation = new Reservation();
        reservation.setPreferences(preferences);
        reservation.setDateDebut(new Date());
        reservation.setDateFin(new Date());

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
