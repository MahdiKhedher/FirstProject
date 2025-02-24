package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {

    List<Commande> findByClientNom(String nom);
    List<Commande> findByClientNomAndDateCommandeBetween(String nom, Date d1, Date d2);
    List<Commande> findByDateCommandeBetweenOrderByNoteAsc(LocalDate dateCommande, LocalDate dateCommande2);

}
