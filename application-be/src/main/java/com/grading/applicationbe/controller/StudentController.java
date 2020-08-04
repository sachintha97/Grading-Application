package com.grading.applicationbe.controller;

import com.grading.applicationbe.dto.AssignmentDto;
import com.grading.applicationbe.dto.CourseAssignmentDto;
import com.grading.applicationbe.mapper.AssignmentMapper;
import com.grading.applicationbe.repository.AssignmentRepository;
import com.grading.applicationbe.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grading")
@CrossOrigin

public class StudentController {
    private final AssignmentRepository assignmentRepository;
    private final CourseRepository courseRepository;
    private final AssignmentMapper assignmentMapper;

    public StudentController(final AssignmentRepository assignmentRepository, final AssignmentMapper assignmentMapper, final CourseRepository courseRepository) {
        this.assignmentRepository = assignmentRepository;
        this.courseRepository = courseRepository;
        this.assignmentMapper = assignmentMapper;
    }

    //assignment
    //this return list of assignments
    @GetMapping("/assignments")
    public List<AssignmentDto> getAssignments() {
        return assignmentMapper.toResponseDtoList(assignmentRepository.findAll());
    }
//    @GetMapping("/assignments")
//    public List<CourseAssignmentDto> getAssignments() {
//        return assignmentMapper.toResponseDtoList(assignmentRepository.findAll(),courseRepository.findAll());
//    }

}
