package com.grading.applicationbe.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "assignment")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int assignmentId;

    private String assignmentName;

    // define the property in attempts class that will be used to map the mappedBy variable
    @OneToMany(mappedBy="assignment")
    private Set<Attempts> attempts;

    // define the property in questions class that will be used to map the mappedBy variable
    @OneToMany(mappedBy="assignment")
    private Set<Question> questions;

    // courseId foreign key
    @ManyToOne
    @JoinColumn(name="course_id", nullable=false)
    private Course course;

    /**constructors and public getter and setter methods*/

    public Assignment() {
    }

    public Assignment(String assignmentName, Set<Attempts> attempts, Set<Question> questions, Course course) {
        this.assignmentName = assignmentName;
        this.attempts = attempts;
        this.questions = questions;
        this.course = course;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public Set<Attempts> getAttempts() {
        return attempts;
    }

    public void setAttempts(Set<Attempts> attempts) {
        this.attempts = attempts;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
