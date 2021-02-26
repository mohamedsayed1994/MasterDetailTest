package com.masterDetail.test.service;

import com.masterDetail.test.entity.Question;
import com.masterDetail.test.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
    private QuestionRepo questionRepo;

    @Autowired
    public QuestionServiceImpl(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public List<Question> findAll() {
        return this.questionRepo.findAll();
    }

    @Override
    public Question findById(Long id) {
        return this.questionRepo.findById(id).orElse(null);
    }

    @Override
    public Question create(Question question) {
        return this.questionRepo.save(question);
    }

    @Override
    public Question update(Question question) {
        return this.questionRepo.save(question);
    }
}
