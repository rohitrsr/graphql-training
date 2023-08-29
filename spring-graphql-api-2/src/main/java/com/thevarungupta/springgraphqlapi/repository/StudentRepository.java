package com.thevarungupta.springgraphqlapi.repository;

import com.thevarungupta.springgraphqlapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
