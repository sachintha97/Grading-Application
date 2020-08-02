package com.grading.applicationbe.controller;

import com.grading.applicationbe.model.Assignment;
import com.grading.applicationbe.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/grading")
@CrossOrigin

public class StudentController {
    @Autowired
    AssignmentRepository assignmentRepository;

    //assignment
    //this return list of assignments
    @GetMapping("/assignment")
    public List<Assignment> viewAssignment() {
        return assignmentRepository.findAll();
    }
}
