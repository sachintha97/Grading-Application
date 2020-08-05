package com.grading.applicationbe.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    private String courseName;

    @OneToMany(mappedBy="course",targetEntity = Assignment.class,cascade = CascadeType.ALL)
    private Set<Assignment> assignments;

    // teacherId foreign key
    @ManyToOne
    @JoinColumn(name="teacher_id", nullable=false)
    private Teacher teacher;

    // student-course join table
    @ManyToMany(mappedBy = "enrolledCourses")
    Set<Student> enrolls;

    /**constructors and public getter and setter methods*/

    public Course() {
    }

    public Course(String courseName, Set<Assignment> assignment, Teacher teacher, Set<Student> enrolls) {
        this.courseName = courseName;
        this.assignments = assignment;
        this.teacher = teacher;
        this.enrolls = enrolls;
    }

    public Course(String courseName) {
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

    public Set<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(Set<Assignment> assignments) {
        this.assignments = assignments;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Set<Student> getEnrolls() {
        return enrolls;
    }

    public void setEnrolls(Set<Student> enrolls) {
        this.enrolls = enrolls;
    }
}
