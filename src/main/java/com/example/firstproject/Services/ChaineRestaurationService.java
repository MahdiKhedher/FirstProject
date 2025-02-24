package com.example.firstproject.Services;

import com.example.firstproject.Repositories.ChaineRestaurationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class ChaineRestaurationService {
    ChaineRestaurationRepository chaineRestaurationRepository;
}
