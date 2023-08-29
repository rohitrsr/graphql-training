package com.thevarungupta.grapnelproject.service;

import com.thevarungupta.grapnelproject.entity.Book;

import java.util.List;

public interface BookService {
    // create
    Book create(Book book);

    // get all
    List<Book> getAllBooks();

    // get single book
    Book getBookById(int bookId);
}
