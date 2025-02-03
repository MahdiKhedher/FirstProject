package com.example.firstproject.Entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Composant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;

    @ManyToOne
    private Menu menu;

    @OneToOne
    private DetailComposant detailComposant;

}
