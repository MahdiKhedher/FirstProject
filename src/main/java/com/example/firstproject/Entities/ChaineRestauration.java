package com.example.firstproject.Entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class ChaineRestauration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;

    private String libelle;

    private LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestauration")
    private List<Restaurant> Restaurants;


}
