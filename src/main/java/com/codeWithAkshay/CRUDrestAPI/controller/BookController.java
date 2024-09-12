package com.codeWithAkshay.CRUDrestAPI.controller;


import com.codeWithAkshay.CRUDrestAPI.Entities.Book;
import com.codeWithAkshay.CRUDrestAPI.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    public BookController() {
    }

    @GetMapping({"/book"})
    public List<Book> getBook() {
      return   bookService.getAllBooks();

    }

    @GetMapping({"/book/{id}"})
    public Book getBook(@PathVariable("id") int id) {
        return bookService.getBookByID(id);
    }

    @PostMapping({"/book"})
    public Book addBook(@RequestBody Book book) {
        Book b = bookService.addBook(book);
        return b;
    }

    @DeleteMapping({"/book/{bookId}"})
    public void deleteBook(@PathVariable("bookId") int bookId) {
        bookService.DeleteBook(bookId);
    }

    @PutMapping({"/book/{boid}"})
    public Book updateBook(@RequestBody Book book, @PathVariable("boid") int boid) {
        bookService.UpdateBook(book, boid);
        return book;
    }
}
