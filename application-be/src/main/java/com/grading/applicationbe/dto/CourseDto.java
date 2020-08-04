package com.grading.applicationbe.dto;

import java.util.Objects;

public class CourseDto {

    private int courseId;

    private String courseName;

    public CourseDto() {
    }

    public CourseDto(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseDto)) return false;
        CourseDto courseDto = (CourseDto) o;
        return getCourseId() == courseDto.getCourseId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseId());
    }

    @Override
    public String toString() {
        return "CourseDto{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
