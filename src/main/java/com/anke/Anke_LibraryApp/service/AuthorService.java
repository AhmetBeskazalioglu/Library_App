package com.anke.Anke_LibraryApp.service;

import com.anke.Anke_LibraryApp.entity.Author;
import com.anke.Anke_LibraryApp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private AuthorRepository repository;

    @Autowired
    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<Author> getAllAuthors() {
        return repository.findAll();
    }

    public Author createAuthor(Author author) {
        return repository.save(author);
    }
}
