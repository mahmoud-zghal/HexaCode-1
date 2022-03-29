package com.example.hexacode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import  com.example.hexacode.Entity.Theme;
import  com.example.hexacode.repository.ThemeRepository;
import  com.example.hexacode.service.ThemeService;

@RestController
public class ThemeController {
    @Autowired
    ThemeService themeService;
//    @Autowired
//    ThemeRepository themeRepository;

    @PostMapping("/addTheme")
    public Theme addTheme(@RequestBody Theme theme){
        return themeService.addTheme(theme);
    }
    @DeleteMapping("deleteTheme/{idTheme}")
    public void deleteTheme(@PathVariable Long idTheme){
        themeService.deleteTheme(idTheme);
    }
}
