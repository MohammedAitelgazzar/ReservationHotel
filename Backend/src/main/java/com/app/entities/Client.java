package com.app.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @XmlElement
    private Long id;
    @XmlElement
    private String nom;
    @XmlElement
    private String prenom;
    @XmlElement
    private String email;
    @XmlElement
    private String telephone;

    @OneToMany(mappedBy = "client")
    @JsonIgnoreProperties("client")
    @XmlTransient
    private List<Reservation> reservations;
}
