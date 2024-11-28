package com.app;

import com.app.dao.ChambreRepository;
import com.app.dao.ClientRepository;
import com.app.dao.ReservationRepository;
import com.app.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class ReservationhotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationhotelApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(ChambreRepository chambreRepository,
                               ClientRepository clientRepository,
                               ReservationRepository reservationRepository) {
        return args -> {
            // Initialisation des chambres
            Chambre chambre1 = new Chambre(null, 100.0, true, TypeChambre.SIMPLE, null);
            Chambre chambre2 = new Chambre(null, 200.0, true, TypeChambre.DOUBLE, null);
            chambreRepository.saveAll(Arrays.asList(chambre1, chambre2));

            // Initialisation des clients
            Client client1 = new Client(null, "Dupont", "Jean", "jean.dupont@example.com", "0601020304", null);
            Client client2 = new Client(null, "Martin", "Claire", "claire.martin@example.com", "0605060708", null);
            clientRepository.saveAll(Arrays.asList(client1, client2));

            // Initialisation des réservations
            Reservation reservation1 = new Reservation(null, new Date(), new Date(), "Vue sur mer", client1, chambre1);
            Reservation reservation2 = new Reservation(null, new Date(), new Date(), "Proche ascenseur", client2, chambre2);
            reservationRepository.saveAll(Arrays.asList(reservation1, reservation2));

            System.out.println("Base de données initialisée avec des données de test !");
        };
    }
}
