package com.app.dao;

import com.app.entities.Chambre;
import com.app.entities.Client;
import com.app.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    @Query("SELECT c FROM Client c WHERE c.id = :clientId")
    Client findClientById(@Param("clientId") Long clientId);

    @Query("SELECT ch FROM Chambre ch WHERE ch.id = :chambreId")
    Chambre findChambreById(@Param("chambreId") Long chambreId);

    boolean existsById(Long id);
}
