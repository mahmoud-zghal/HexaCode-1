package com.example.hexacode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.example.hexacode.Entity.Question;
import  com.example.hexacode.repository.QuestionRepository;
import  com.example.hexacode.repository.quizzQuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    quizzQuestionRepository quizRepository;

    @Override
    public Question addQuestion(Question question){
        return questionRepository.save(question);
    }

    @Override
    public Long countQuestionByIsvalid(Long idQuiz) {
        return questionRepository.countValidQuestionsByQuizAndIsValidTrue(idQuiz);
    }
//
//    @Override
//    public Long countQuestionByIsvalid(Long idQuiz) {
//
//        return questionRepository.countQuestionByIsvalid(idQuiz);
//    }

    @Override
    public void deleteQuestion(Long idQuestion) {
        questionRepository.deleteById(idQuestion);
    }

}
