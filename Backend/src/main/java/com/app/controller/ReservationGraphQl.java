package com.app.controller;

import com.app.dao.ReservationRepository;
import com.app.entities.Chambre;
import com.app.entities.Client;
import com.app.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
public class ReservationGraphQl {

    @Autowired
    private ReservationRepository reservationRepository;

    @QueryMapping
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    @QueryMapping
    public Reservation getReservation(@Argument Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @MutationMapping
    public Reservation createReservation(
            @Argument String preferences,
            @Argument Long clientId,
            @Argument Long chambreId,
            @Argument Date dateDebut,
            @Argument Date dateFin) {

        Client client = reservationRepository.findClientById(clientId);
        Chambre chambre = reservationRepository.findChambreById(chambreId);

        if (client != null && chambre != null) {
            Reservation reservation = new Reservation();
            reservation.setPreferences(preferences);
            reservation.setClient(client);
            reservation.setChambre(chambre);
            reservation.setDateDebut(dateDebut); // Set the start date
            reservation.setDateFin(dateFin);     // Set the end date
            return reservationRepository.save(reservation);
        }
        return null; // Handle cases where client or chambre is not found
    }


    @MutationMapping
    public boolean deleteReservation(@Argument Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}