package com.masterDetail.test.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class QuestionAnswerDto {
    private Long id;
    private String answer;

    public QuestionAnswerDto(String answer) {
        this.answer = answer;
    }
}
