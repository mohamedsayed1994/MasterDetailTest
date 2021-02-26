package com.masterDetail.test.repository;

import com.masterDetail.test.entity.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionAnswerRepo extends JpaRepository<QuestionAnswer,Long> {
}
