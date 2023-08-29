package com.thevarungupta.springgraphqlapi.repository;

import com.thevarungupta.springgraphqlapi.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
