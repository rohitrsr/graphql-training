package com.thevarungupta.grapnelproject.service.impl;

import com.thevarungupta.grapnelproject.entity.Book;
import com.thevarungupta.grapnelproject.repository.BookRepository;
import com.thevarungupta.grapnelproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int bookId) {
        return bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("no book found"));
    }
}
