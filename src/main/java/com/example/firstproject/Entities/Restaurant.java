package com.example.firstproject.Entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Restaurant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;
    private Long nbPlacesMax;

    @ManyToOne
    private ChaineRestauration chaineRestauration;

    @OneToMany
    private List<Menu> menus;

    public Restaurant() {
    }

    public Restaurant(String nom, Long nbPlacesMax) {
        this.nom = nom;
        this.nbPlacesMax = nbPlacesMax;
    }

    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getNbPlacesMax() {
        return nbPlacesMax;
    }

    public void setNbPlacesMax(Long nbPlacesMax) {
        this.nbPlacesMax = nbPlacesMax;
    }
}
