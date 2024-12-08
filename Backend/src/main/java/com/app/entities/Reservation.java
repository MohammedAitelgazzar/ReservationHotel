package com.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Reservation {
    @XmlElement
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @XmlElement
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @XmlElement
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @XmlElement
    private String preferences;
    @XmlElement
    @ManyToOne
    @JsonIgnoreProperties("reservations")
    private Client client;
    @XmlElement
    @ManyToOne
    @JsonIgnoreProperties("reservations")
    private Chambre chambre;

}
