package com.masterDetail.test.repository;

import com.masterDetail.test.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRep extends JpaRepository<Question,Long> {
}
