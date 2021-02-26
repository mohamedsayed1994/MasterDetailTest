package com.masterDetail.test.controller;

import com.masterDetail.test.entity.Question;
import com.masterDetail.test.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> findAll() {
        return this.questionService.findAll();
    }

    @GetMapping("{id}")
    public Question findById(@PathVariable Long id) {
        return this.questionService.findById(id);
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return this.questionService.create(question);
    }

    @PutMapping
    public Question updateQuestion(@RequestBody Question question) {
        return this.questionService.update(question);
    }
}
