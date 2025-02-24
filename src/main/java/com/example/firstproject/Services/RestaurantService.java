package com.example.firstproject.Services;

import com.example.firstproject.Repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RestaurantService {
    RestaurantRepository restaurantRepository;
}
