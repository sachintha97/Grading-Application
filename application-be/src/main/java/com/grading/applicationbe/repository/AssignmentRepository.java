package com.grading.applicationbe.repository;

import com.grading.applicationbe.dto.CourseAssignmentDto;
import com.grading.applicationbe.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {
    // get both assignment and course details
    @Query("SELECT new com.grading.applicationbe.dto.CourseAssignmentDto(a.assignmentId,a.assignmentName, c.courseName,c.courseId) FROM Assignment a INNER JOIN a.course c")
    public List<CourseAssignmentDto> getAllAssignments();
}
