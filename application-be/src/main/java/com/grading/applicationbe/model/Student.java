package com.grading.applicationbe.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

// specifies that the class is an entity and is mapped to a database table
@Entity
@Table(name = "students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @OneToMany(mappedBy="student")
    private Set<Attempts> attempts;

    // student-course join table
    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<Course> enrolledCourses;


    /**constructors and public getter and setter methods*/

    public Student() {
    }

    public Student(@NotBlank String firstName, @NotBlank String lastName, Set<Attempts> attempts, Set<Course> enrolledCourses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.attempts = attempts;
        this.enrolledCourses = enrolledCourses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public Set<Attempts> getAttempts() {
        return attempts;
    }

    public void setAttempts(Set<Attempts> attempts) {
        this.attempts = attempts;
    }

    public Set<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(Set<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
