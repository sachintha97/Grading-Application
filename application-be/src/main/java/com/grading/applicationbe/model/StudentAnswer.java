package com.grading.applicationbe.model;

import javax.persistence.*;

@Entity
@Table(name = "student_answer")
public class StudentAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    // attemptId foreign key
    @ManyToOne
    @JoinColumn(name="attempt_id", nullable=false)
    private Attempts attempts;

    // questionId foreign key
    @ManyToOne
    @JoinColumn(name="question_id", nullable=false)
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
