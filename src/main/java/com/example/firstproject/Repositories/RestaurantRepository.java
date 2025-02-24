package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {


}
