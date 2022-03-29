package com.example.hexacode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.example.hexacode.Entity.History;
import  com.example.hexacode.repository.HistoryRepository;



@Service
public class HistoryServiceImpl implements HistoryService{
    @Autowired
    HistoryRepository historyRepository;

    @Override
    public History addHistory(History history) {
        return historyRepository.save(history);
    }

    @Override
    public History findHistoryByScore(Long score) {
        return historyRepository.findHistoryByScore(score);
    }

    @Override
    public History findHistoryByUsername(String username) {
        return historyRepository.findHistoryByUsername(username);
    }


}
