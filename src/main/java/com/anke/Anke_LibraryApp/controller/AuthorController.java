package com.anke.Anke_LibraryApp.controller;

import com.anke.Anke_LibraryApp.entity.Author;
import com.anke.Anke_LibraryApp.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

        private AuthorService service;

        public AuthorController() {
        }

        @Autowired
        public AuthorController(AuthorService service) {
            this.service = service;
        }

        @GetMapping
        public List<Author> getAllAuthors() {
            return service.getAllAuthors();
        }

        @PostMapping("/create")
        public Author createAuthor(@RequestBody Author author) {
            return service.createAuthor(author);
        }
}