package com.masterDetail.test.service;

import com.masterDetail.test.entity.Question;
import com.masterDetail.test.repository.QuestionRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
    private QuestionRep questionRep;

    @Autowired
    public QuestionServiceImpl(QuestionRep questionRep) {
        this.questionRep = questionRep;
    }

    @Override
    public List<Question> findAll() {
        return this.questionRep.findAll();
    }

    @Override
    public Question findById(Long id) {
        return this.questionRep.findById(id).orElse(null);
    }

    @Override
    public Question create(Question question) {
        return this.questionRep.save(question);
    }

    @Override
    public Question update(Question question) {
        return this.questionRep.save(question);
    }
}
