package com.example.hexacode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import  com.example.hexacode.Entity.Question;
import  com.example.hexacode.service.QuestionService;

@RestController
public class QuestionController {


    @Autowired
    QuestionService questionService;

    @RequestMapping(value = { "/countValidQuestionsInQuiz/{id}" }, method = RequestMethod.GET)
    public Long countValidQuestionsInQuiz(@PathVariable("id") Long idQuiz) {
        return questionService.countQuestionByIsvalid(idQuiz);
    }

    @RequestMapping(value = { "/addQuestion" }, method = RequestMethod.POST)
    public Question addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @RequestMapping(value = { "/deleteQuestion/{id}" }, method = RequestMethod.DELETE)
    public void deleteQuestion(@PathVariable Long idQuestion){
        questionService.deleteQuestion(idQuestion);
    }

}
