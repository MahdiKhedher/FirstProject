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

}
