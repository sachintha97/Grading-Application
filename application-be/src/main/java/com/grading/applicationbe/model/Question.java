package com.grading.applicationbe.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;

    private String question;

    private String correctAnswer;

    // assignmentId foreign key
    @ManyToOne
    @JoinColumn(name="assignment_id", nullable=false)
    private Assignment assignment;

    @OneToMany(mappedBy="question")
    private Set<StudentAnswer> studentAnswers;

    /**constructors and public getter and setter methods*/

    public Question() {
    }

    public Question(String question, String correctAnswer, Assignment assignment, Set<StudentAnswer> studentAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.assignment = assignment;
        this.studentAnswers = studentAnswers;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Set<StudentAnswer> getStudentAnswers() {
        return studentAnswers;
    }

    public void setStudentAnswers(Set<StudentAnswer> studentAnswers) {
        this.studentAnswers = studentAnswers;
    }
}
