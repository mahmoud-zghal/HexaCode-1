package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.example.hexacode.Entity.Answer;
@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}