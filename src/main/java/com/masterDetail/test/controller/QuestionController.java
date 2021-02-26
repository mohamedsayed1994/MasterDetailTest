package com.masterDetail.test.controller;

import com.masterDetail.test.controller.dto.QuestionDto;
import com.masterDetail.test.entity.Question;
import com.masterDetail.test.service.QuestionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    private QuestionService questionService;
    private ModelMapper modelMapper;

    @Autowired
    public QuestionController(QuestionService questionService, ModelMapper modelMapper) {
        this.questionService = questionService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<QuestionDto> findAll() {
        List<Question> posts = this.questionService.findAll();
        return posts.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
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

    private QuestionDto convertToDto(Question question) {
        //QuestionDto countryDto = this.modelMapper.map(question, QuestionDto.class);
//        countryDto.setSubmissionDate(country.getSubmissionDate(),
//                userService.getCurrentUser().getPreference().getTimezone());
        return this.modelMapper.map(question, QuestionDto.class);
    }
}
