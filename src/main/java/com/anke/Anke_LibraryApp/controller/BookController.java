package com.anke.Anke_LibraryApp.controller;

import com.anke.Anke_LibraryApp.entity.Book;
import com.anke.Anke_LibraryApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

        private BookService service;

        public BookController() {
        }

        @Autowired
        public BookController(BookService service) {
            this.service = service;
        }

        @GetMapping
        public List<Book> getAllBooks() {
            return service.getAllBooks();
        }

        @PostMapping("/create")
        public Book createBook(@RequestBody Book book) {
            return service.createBook(book);
        }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }
}