package com.grading.applicationbe.repository;

import com.grading.applicationbe.model.StudentAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAnswerRepository extends JpaRepository<StudentAnswer, Integer> {
}
