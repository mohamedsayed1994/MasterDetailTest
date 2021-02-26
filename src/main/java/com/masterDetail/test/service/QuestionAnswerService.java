package com.masterDetail.test.service;

import com.masterDetail.test.entity.QuestionAnswer;

import java.util.List;

public interface QuestionAnswerService {
    List<QuestionAnswer> findAll();

    QuestionAnswer findById(Long id);

    QuestionAnswer create(QuestionAnswer questionAnswer);

    QuestionAnswer update(QuestionAnswer questionAnswer);
}
