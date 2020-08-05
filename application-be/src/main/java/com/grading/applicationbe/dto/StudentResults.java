package com.grading.applicationbe.dto;

public class StudentResults {
    private int attemptId;

    private String firstName;

    private String lastName;

    private double grade;

    private int assignmentId;


    public StudentResults() {
    }

    public StudentResults(int attemptId, String firstName, String lastName, double grade, int assignmentId) {
        this.attemptId = attemptId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.assignmentId = assignmentId;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }
}
