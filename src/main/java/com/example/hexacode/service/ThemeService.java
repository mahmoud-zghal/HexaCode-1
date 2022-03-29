package com.example.hexacode.service;

import org.springframework.stereotype.Service;
import  com.example.hexacode.Entity.Theme;

@Service
public interface ThemeService {
    Theme addTheme(Theme theme);
    void deleteTheme(Long idTheme);
}
