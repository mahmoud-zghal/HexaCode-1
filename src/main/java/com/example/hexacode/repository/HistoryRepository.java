package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.hexacode.Entity.History;


@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
    History findHistoryByScore(Long score);

    History findHistoryByUsername(String username);

}