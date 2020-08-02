package com.grading.applicationbe.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "attempts")
public class Attempts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attemptId;

    private double grade;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date attemptDateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDateTime;

    // studentId foreign key
    @ManyToOne
    @JoinColumn(name="student_id", nullable=false)
    private Student student;

    // assignmentId foreign key
    @ManyToOne
    @JoinColumn(name="assignment_id", nullable=false)
    private Assignment assignment;

    @OneToOne(mappedBy = "attempts")
    private StudentAnswer studentAnswer;

    /**constructors and public getter and setter methods*/

    public Attempts() {
    }

    public Attempts(double grade, Date attemptDateTime, Date startDateTime, Date endDateTime, Student student, Assignment assignment, StudentAnswer studentAnswer) {
        this.grade = grade;
        this.attemptDateTime = attemptDateTime;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.student = student;
        this.assignment = assignment;
        this.studentAnswer = studentAnswer;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getAttemptId() {
        return attemptId;
    }

    public void setAttemptId(int attemptId) {
        this.attemptId = attemptId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Date getAttemptDateTime() {
        return attemptDateTime;
    }

    public void setAttemptDateTime(Date attemptDateTime) {
        this.attemptDateTime = attemptDateTime;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public StudentAnswer getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(StudentAnswer studentAnswer) {
        this.studentAnswer = studentAnswer;
    }
}
