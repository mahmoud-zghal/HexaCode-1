package com.example.hexacode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import  com.example.hexacode.Entity.Level;
import  com.example.hexacode.service.LevelService;

@RestController
public class LevelController {


    @Autowired
    LevelService levelService;
    @PostMapping ("addLevel/{idTheme}")
    public Level addLevel(@RequestBody Level level, @PathVariable Long idTheme){
        return levelService.addLevel(level,idTheme);
    }
    @GetMapping("/getLevel/{idLevel}")
    public Level getLevel(@PathVariable Long idLevel){
        return levelService.getLevel(idLevel);
    }
    @DeleteMapping("deleteLevel/{idLevel}")
    public void deleteLevel(@PathVariable Long idLevel){
        levelService.deleteLevel(idLevel);
    }
}
