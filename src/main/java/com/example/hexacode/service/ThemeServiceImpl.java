package com.example.hexacode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.example.hexacode.Entity.Theme;
import  com.example.hexacode.repository.ThemeRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class ThemeServiceImpl implements ThemeService{

    @Autowired
    ThemeRepository themeRepository;

    @Override
    public Theme addTheme(Theme theme) {
        return themeRepository.save(theme);
    }

    @Override
    public void deleteTheme(Long idTheme) {
        themeRepository.deleteById(idTheme);
    }
}
