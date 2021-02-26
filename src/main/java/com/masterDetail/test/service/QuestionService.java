package com.masterDetail.test.service;

import com.masterDetail.test.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findAll();

    Question findById(Long id);

    Question create(Question question);

    Question update(Question question);
}
