package com.example.firstproject.Services;

import com.example.firstproject.Repositories.DetailComposantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class DetailComposantService {
    DetailComposantRepository detailComposantRepository;
}
