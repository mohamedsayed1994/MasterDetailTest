package com.masterDetail.test.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class QuestionDto {
    private Long id;
    private String name;
    private List<QuestionAnswerDto> questionAnswers;

    public QuestionDto(String name, List<QuestionAnswerDto> questionAnswers) {
        this.name = name;
        this.questionAnswers = questionAnswers;
    }
}
