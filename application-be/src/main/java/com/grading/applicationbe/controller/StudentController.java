package com.grading.applicationbe.controller;

import com.grading.applicationbe.dto.AssignmentDto;
import com.grading.applicationbe.dto.CourseAssignmentDto;
import com.grading.applicationbe.dto.StudentResults;
import com.grading.applicationbe.mapper.AssignmentMapper;
import com.grading.applicationbe.repository.AssignmentRepository;
import com.grading.applicationbe.repository.AttemptRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grading")
@CrossOrigin

public class StudentController {
    private final AssignmentRepository assignmentRepository;
    private final AssignmentMapper assignmentMapper;
    private final AttemptRepository attemptRepository;

    public StudentController(final AssignmentRepository assignmentRepository, final AssignmentMapper assignmentMapper, final AttemptRepository attemptRepository) {
        this.assignmentRepository = assignmentRepository;
        this.assignmentMapper = assignmentMapper;
        this.attemptRepository = attemptRepository;
    }



    // return list of assignments with course details (both assignment and course details)
    @GetMapping("/assignments")
    public List<CourseAssignmentDto> getAllCourses() {
        return assignmentRepository.getAllAssignments();
    }

    // return relevant student relevant assignment results
    @GetMapping("/results/{sId}/{id}")
    public ResponseEntity<List<StudentResults>> findOneStudentResults(@PathVariable int sId, @PathVariable int id) {
        return new ResponseEntity<>(attemptRepository.findOneStudentResults(sId,id), HttpStatus.OK);
    }



    /**
     * for future enhancement
     * */
    // return list of assignments
    @GetMapping("/assignmentList")
    public List<AssignmentDto> getAssignments() {
        return assignmentMapper.toResponseDtoList(assignmentRepository.findAll());
    }

    // return all results details
    @GetMapping("/results")
    public List<StudentResults> getAllResults() {
        return attemptRepository.getAllResults();
    }

    // return only assignment related results details
    @GetMapping("/results/{id}")
    public ResponseEntity<List<StudentResults>> getAssignmentResults(@PathVariable int id) {
        return new ResponseEntity<>(attemptRepository.findByAssignment(id), HttpStatus.OK);
    }
}
