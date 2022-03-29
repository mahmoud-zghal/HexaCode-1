package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import  com.example.hexacode.Entity.User;
import  com.example.hexacode.Entity.Quiz;

import java.util.List;


@Repository
public interface quizzQuestionRepository extends JpaRepository<Quiz,Long> {

    @Query(
            value = "SELECT * FROM User ",
            nativeQuery = true)
    List<User> findAllEmails();



}
