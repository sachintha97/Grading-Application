package com.grading.applicationbe.dto;

import java.util.Objects;

public class CourseAssignmentDto {
    private int courseId;
    private String courseName;
    private int assignmentId;
    private String assignmentName;

    public CourseAssignmentDto() {
    }

    public CourseAssignmentDto(int courseId, String courseName, int assignmentId, String assignmentName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.assignmentId = assignmentId;
        this.assignmentName = assignmentName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseAssignmentDto)) return false;
        CourseAssignmentDto that = (CourseAssignmentDto) o;
        return getCourseId() == that.getCourseId() &&
                getAssignmentId() == that.getAssignmentId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseId(), getAssignmentId());
    }

    @Override
    public String toString() {
        return "CourseAssignmentDto{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", assignmentId=" + assignmentId +
                ", assignmentName='" + assignmentName + '\'' +
                '}';
    }
}
