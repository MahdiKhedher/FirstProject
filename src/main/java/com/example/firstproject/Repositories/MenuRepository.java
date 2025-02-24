package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Menu;
import com.example.firstproject.Entities.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

    List<Menu> findByMenuTypeAndComposantsPrixGreaterThan(TypeMenu type, double composantsPrix);
    @Query ("select m from Menu m join m.composants mc where mc.nomComposant =:composant")
    List<Menu> findByComposant(@Param("composant") String composant);
}
