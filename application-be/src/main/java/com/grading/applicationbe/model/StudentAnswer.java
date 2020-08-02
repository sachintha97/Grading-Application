package com.grading.applicationbe.model;

import javax.persistence.*;

@Entity
@Table(name = "student_answer")
public class StudentAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    // attemptId foreign key
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "attempt_id", referencedColumnName = "attemptId")
    private Attempts attempts;

    // questionId foreign key
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id", referencedColumnName = "QuestionId")
    private Question question;

    private String studentAnswer;

    /**constructors and public getter and setter methods*/

    public StudentAnswer() {
    }

    public StudentAnswer(Attempts attempts, Question question, String studentAnswer) {
        this.attempts = attempts;
        this.question = question;
        this.studentAnswer = studentAnswer;
    }


    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    public Attempts getAttempts() {
        return attempts;
    }

    public void setAttempts(Attempts attempts) {
        this.attempts = attempts;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
