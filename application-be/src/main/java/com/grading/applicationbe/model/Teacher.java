package com.grading.applicationbe.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "teacher")

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @OneToMany(mappedBy="teacher")
    private Set<Course> courses;

    /**constructors and public getter and setter methods*/

    public Teacher() {
    }

    public Teacher(@NotBlank String firstName, @NotBlank String lastName, Set<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}


