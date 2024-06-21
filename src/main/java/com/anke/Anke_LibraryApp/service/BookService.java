package com.anke.Anke_LibraryApp.service;

import com.anke.Anke_LibraryApp.entity.Book;
import com.anke.Anke_LibraryApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository repository;

    @Autowired
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book createBook(Book book) {
        return repository.save(book);
    }
}
