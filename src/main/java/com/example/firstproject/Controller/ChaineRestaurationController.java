package com.example.firstproject.Controller;

import com.example.firstproject.Services.IChaineRestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class ChaineRestaurationController {
    IChaineRestaurationService chaineRestaurationService;
}
