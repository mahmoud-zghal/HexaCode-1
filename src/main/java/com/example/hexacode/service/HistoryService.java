package com.example.hexacode.service;

import org.springframework.stereotype.Service;
import  com.example.hexacode.Entity.History;



@Service
public interface HistoryService {
    History addHistory(History history);
    History findHistoryByScore(Long score);
    History findHistoryByUsername(String username);
}
