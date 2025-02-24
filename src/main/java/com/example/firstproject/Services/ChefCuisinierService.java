package com.example.firstproject.Services;

import com.example.firstproject.Repositories.ChefCuisinierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class ChefCuisinierService {
    ChefCuisinierRepository chefCuisinierRepository;
}
