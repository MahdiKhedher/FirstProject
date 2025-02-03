package com.example.firstproject.Entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Menu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private Float prixTotal;

    @OneToMany(mappedBy = "menu")
    private List<Commande> Commandes;

    @OneToMany(mappedBy = "menu")
    private List<Composant> composants;

    @ManyToMany
    private List<ChefCuisinier> chefs;
}

