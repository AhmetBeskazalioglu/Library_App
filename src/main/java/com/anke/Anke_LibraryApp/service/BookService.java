package com.anke.Anke_LibraryApp.service;

import com.anke.Anke_LibraryApp.entity.*;
import com.anke.Anke_LibraryApp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private BookRepository repository;

    @Autowired
    public BookService(BookRepository repository, AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.repository = repository;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book createBook(Book book) {
        Author author = authorRepository.findById(book.getAuthor().getId()).orElse(null);
        Publisher publisher = publisherRepository.findById(book.getPublisher().getId()).orElse(null);

        book.setAuthor(author);
        book.setPublisher(publisher);

        return repository.save(book);
    }

    public Book updateBook(Book book) {
        Author author = authorRepository.findById(book.getAuthor().getId()).orElse(null);
        Publisher publisher = publisherRepository.findById(book.getPublisher().getId()).orElse(null);

        book.setAuthor(author);
        book.setPublisher(publisher);

        return repository.save(book);
    }
}

