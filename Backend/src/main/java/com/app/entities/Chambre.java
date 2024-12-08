package com.app.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @XmlElement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @XmlElement
    private Double prix;
    @XmlElement
    private Boolean disponible;
    @XmlElement
    @Enumerated(EnumType.STRING)
    private TypeChambre type;

    @XmlTransient
    @OneToMany(mappedBy = "chambre")
    @JsonIgnoreProperties("chambre")
    private List<Reservation> reservations;
}
