package com.grading.applicationbe.repository;

import com.grading.applicationbe.model.Attempts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttemptRepository extends JpaRepository<Attempts, Integer> {

}
