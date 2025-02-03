package com.example.firstproject.Entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class ChefCuisinier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;

    @ManyToMany(mappedBy = "chefs")
    private List<Menu> menus;

}

