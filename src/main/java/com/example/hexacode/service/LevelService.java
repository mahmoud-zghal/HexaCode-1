package com.example.hexacode.service;

import org.springframework.stereotype.Service;
import  com.example.hexacode.Entity.Level;

@Service
public interface LevelService {
    Level addLevel(Level level , Long idTheme);
    Level getLevel(Long idLevel);
    void deleteLevel(Long idLevel);
}
