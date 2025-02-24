package com.example.firstproject.Services;

import com.example.firstproject.Repositories.CommandeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class CommandeService {
    CommandeRepository commandeRepository;
}
