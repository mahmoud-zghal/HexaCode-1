package com.example.hexacode.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import  com.example.hexacode.Entity.Level;
import  com.example.hexacode.Entity.User;
import  com.example.hexacode.Entity.Quiz;
import  com.example.hexacode.repository.LevelRepository;
import  com.example.hexacode.repository.quizzQuestionRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class quizzQuestionServiceImpl implements quizzQuestionService{

    private JavaMailSender mailSender;
    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
    @Autowired
    quizzQuestionRepository questionRepository;
    @Autowired
    LevelRepository levelRepository;
    @Override
    public Quiz addQuizzQuestion(Quiz question, Long idLevel) {

        Level level = levelRepository.findById(idLevel).orElse(null);
        return questionRepository.save(question);
    }

    @Override
    public void deleteQuestion(Long idQuestion) {

         questionRepository.deleteById(idQuestion);
    }

    @Override
    public Quiz updateQuestion(Quiz question) {
        return questionRepository.save(question);
    }

    @Override
    public Quiz addQuizzQuestion(Quiz question) {

        return questionRepository.save(question);
    }

    @Override
    public boolean equals(String CorrectAnswer, String Answer) {

        return CorrectAnswer.toLowerCase().contains(Answer);
    }

    @Override
    public List<User> findAllEmails() {
        return questionRepository.findAllEmails();
    }

}