package com.example.firstproject.Controller;

import com.example.firstproject.Services.IChefCuisinierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor

public class ChefCuisinierController {
    IChefCuisinierService chefCuisinierService;
}
