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

    public ChaineRestauration() {
    }

    public ChaineRestauration(String libelle, LocalDate dateCreation) {
        this.libelle = libelle;
        this.dateCreation = dateCreation;
    }

    // Getters and Setters
    public Long getIdChaineRestauration() {
        return idChaineRestauration;
    }

    public void setIdChaineRestauration(Long idChaineRestauration) {
        this.idChaineRestauration = idChaineRestauration;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
}
