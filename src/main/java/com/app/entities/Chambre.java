package com.app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private double prix ;
    private boolean disponible;
    @Enumerated(EnumType.STRING)
    private TypeChambre type;

    @OneToMany(mappedBy = "chambre")
    private List<Reservation> reservations;
}
