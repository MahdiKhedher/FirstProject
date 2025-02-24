package com.example.firstproject.Services;

import com.example.firstproject.Repositories.ComposantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class ComposantService {
    ComposantRepository composantRepository;
}
