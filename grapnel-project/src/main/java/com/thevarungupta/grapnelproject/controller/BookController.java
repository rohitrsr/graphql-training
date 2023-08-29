package com.thevarungupta.grapnelproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.thevarungupta.grapnelproject.entity.Book;
import com.thevarungupta.grapnelproject.payload.BookInput;
import com.thevarungupta.grapnelproject.service.BookService;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    // get all
    @QueryMapping("allBooks")
    public List<Book> allBooks(){
        return bookService.getAllBooks();
    }

    @QueryMapping("getBook")
    public Book getBook(@Argument int bookId){
        return bookService.getBookById(bookId);
    }

    // create - mutation
    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setDescription(book.getDescription());
        b.setPrice(book.getPrice());
        b.setAuthor(book.getAuthor());
        b.setPage(book.getPage());
        return bookService.create(b);
    }
}
