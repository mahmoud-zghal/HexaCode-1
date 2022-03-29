package com.example.hexacode.service;

import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.stereotype.Service;
import  com.example.hexacode.Entity.Question;

@Service
public interface QuestionService {

    Question addQuestion (Question question);
    //Long countQuestionByQuizAndIsvalidIsTrue(Long idQuiz);
   // Long countQuestionByIsvalid(Long idQuiz);

    Long countQuestionByIsvalid(Long idQuiz);

    void deleteQuestion (Long idQuestion);
}
