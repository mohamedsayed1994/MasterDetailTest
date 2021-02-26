package com.masterDetail.test.service;

import com.masterDetail.test.entity.QuestionAnswer;
import com.masterDetail.test.repository.QuestionAnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionAnswerServiceImpl implements QuestionAnswerService {
    private QuestionAnswerRepo questionAnswerRepo;

    @Autowired
    public QuestionAnswerServiceImpl(QuestionAnswerRepo questionAnswerRepo) {
        this.questionAnswerRepo = questionAnswerRepo;
    }

    @Override
    public List<QuestionAnswer> findAll() {
        return this.questionAnswerRepo.findAll();
    }

    @Override
    public QuestionAnswer findById(Long id) {
        return this.questionAnswerRepo.findById(id).orElse(null);
    }

    @Override
    public QuestionAnswer create(QuestionAnswer questionAnswer) {
        return this.questionAnswerRepo.save(questionAnswer);
    }

    @Override
    public QuestionAnswer update(QuestionAnswer questionAnswer) {
        return this.questionAnswerRepo.save(questionAnswer);
    }
}
