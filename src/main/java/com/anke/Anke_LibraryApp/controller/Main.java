package com.anke.Anke_LibraryApp.controller;

import com.anke.Anke_LibraryApp.entity.Author;
import com.anke.Anke_LibraryApp.entity.Book;
import com.anke.Anke_LibraryApp.entity.Publisher;
import com.anke.Anke_LibraryApp.repository.PublisherRepository;
import com.anke.Anke_LibraryApp.service.PublisherService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.setName("O'Reilly Media");

        Book book = new Book();
        book.setTitle("Java Programming");

        Author author = new Author();
        author.setFirstName("John");
        author.setLastName("Doe");

        book.setPublisher(publisher);
        publisher.setBooks(List.of(book));

        book.setAuthor(author);
        author.setBook(book);


    }
}
