package com.example.firstproject.Entities;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class DetailComposant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float imc;

    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    @OneToOne
    @JoinColumn(name = "composant_id")
    private Composant composant;

}

