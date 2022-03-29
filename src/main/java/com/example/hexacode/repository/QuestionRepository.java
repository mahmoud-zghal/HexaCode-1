package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import  com.example.hexacode.Entity.Question;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("SELECT count(q.isvalid) from Question q join q.quiz z where z.idQuiz=?1 and (q.isvalid = true)")
    Long countValidQuestionsByQuizAndIsValidTrue(@Param("idQuiz") Long idQuiz);
}