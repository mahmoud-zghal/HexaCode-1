package com.example.hexacode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.example.hexacode.Entity.Level;
import  com.example.hexacode.Entity.Theme;
import  com.example.hexacode.repository.LevelRepository;
import  com.example.hexacode.repository.ThemeRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class LevelServiceImpl implements LevelService{
    @Autowired
    LevelRepository levelRepository;
    @Autowired
    ThemeRepository themeRepository;

    @Override
    public Level addLevel(Level level, Long idTheme) {
        Theme theme= themeRepository.findById(idTheme).orElse(null);
        level.setTheme(theme);
        return levelRepository.save(level);
    }

    @Override
    public Level getLevel(Long idLevel) {
        return levelRepository.findById(idLevel).orElse(null);
    }

    @Override
    public void deleteLevel(Long idLevel) {
         levelRepository.deleteById(idLevel);
    }
}
