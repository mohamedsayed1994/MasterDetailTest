package com.masterDetail.test.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "question_answer")
@NoArgsConstructor
@Getter
@Setter
public class QuestionAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Long id;
    @Column(name = "answer")
    private String answer;
//    @ManyToOne
//    @JoinColumn(name = "question_id")
//    private Question question;

}
