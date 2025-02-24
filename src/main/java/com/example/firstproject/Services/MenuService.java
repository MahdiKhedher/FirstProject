package com.example.firstproject.Services;

import com.example.firstproject.Repositories.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class MenuService {
    MenuRepository menuRepository;
}
