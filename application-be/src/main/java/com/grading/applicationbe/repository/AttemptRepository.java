package com.grading.applicationbe.repository;

import com.grading.applicationbe.dto.StudentResults;
import com.grading.applicationbe.model.Attempts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttemptRepository extends JpaRepository<Attempts, Integer> {
    // get all results
    @Query("SELECT new com.grading.applicationbe.dto.StudentResults(a.attemptId,s.firstName, s.lastName,a.grade , assignment.assignmentId ) FROM Attempts a INNER JOIN a.student s INNER JOIN a.assignment assignment")
    public List<StudentResults> getAllResults();

    // get only assignment related results
    @Query("SELECT new com.grading.applicationbe.dto.StudentResults(a.attemptId,s.firstName, s.lastName,a.grade , assignment.assignmentId ) FROM Attempts a INNER JOIN a.student s INNER JOIN a.assignment assignment where assignment.assignmentId=:id")
    List<StudentResults> findByAssignment(@Param("id") int id);

    // get relevant student relevant assignment results
    @Query("SELECT new com.grading.applicationbe.dto.StudentResults(a.attemptId,s.firstName, s.lastName,a.grade , assignment.assignmentId ) FROM Attempts a INNER JOIN a.student s INNER JOIN a.assignment assignment where assignment.assignmentId=:id AND s.studentId=:sid")
    List<StudentResults> findOneStudentResults(@Param ("sid") int sid, @Param("id")int id);

}
