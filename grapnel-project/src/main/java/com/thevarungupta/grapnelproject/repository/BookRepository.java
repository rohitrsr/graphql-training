package com.thevarungupta.grapnelproject.repository;

import com.thevarungupta.grapnelproject.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
