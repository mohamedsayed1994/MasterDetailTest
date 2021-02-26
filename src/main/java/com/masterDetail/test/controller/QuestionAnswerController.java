package com.masterDetail.test.controller;

import com.masterDetail.test.entity.QuestionAnswer;
import com.masterDetail.test.service.QuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions-answer")
public class QuestionAnswerController {
    private QuestionAnswerService questionAnswerService;

    @Autowired
    public QuestionAnswerController(QuestionAnswerService questionAnswerService) {
        this.questionAnswerService = questionAnswerService;
    }

    @GetMapping
    public List<QuestionAnswer> findAll() {
        return this.questionAnswerService.findAll();
    }

    @GetMapping("{id}")
    public QuestionAnswer findById(@PathVariable Long id) {
        return this.questionAnswerService.findById(id);
    }

    @PostMapping
    public QuestionAnswer addAnswer(@RequestBody QuestionAnswer questionAnswer) {
        return this.questionAnswerService.create(questionAnswer);
    }

    @PutMapping
    public QuestionAnswer updateQuestion(@RequestBody QuestionAnswer questionAnswer) {
        return this.questionAnswerService.update(questionAnswer);
    }
}
