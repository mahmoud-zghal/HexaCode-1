package com.example.hexacode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import  com.example.hexacode.Entity.History;
import  com.example.hexacode.service.HistoryService;


@RestController
public class HistoryController {
    @Autowired
    HistoryService historyService;
    @PostMapping("addHistory")
    public History addHistory(@RequestBody History history){
        return historyService.addHistory(history);
    }

    @GetMapping("getScore/{score}")
    public History findHistoryByScore(@PathVariable Long score){
        return historyService.findHistoryByScore(score);
    }

    @GetMapping("getUsername/{username}")
    public History findHistoryByUsername(@PathVariable String username){
        return historyService.findHistoryByUsername(username);
    }

}
