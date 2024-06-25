package com.anke.Anke_LibraryApp.controller;

import com.anke.Anke_LibraryApp.entity.*;
import com.anke.Anke_LibraryApp.service.AuthorService;
import com.anke.Anke_LibraryApp.service.BookService;
import com.anke.Anke_LibraryApp.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

//    private BookService bookService;
//    private AuthorService authorService;
    private PublisherService service;

    @Autowired
    public PublisherController(PublisherService service) {
        this.service = service;
    }

    /*@Autowired
    public PublisherController(BookService bookService, AuthorService authorService, PublisherService service) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.service = service;
    }*/

    @GetMapping
    public List<Publisher> getAllPublishers() {
        return service.getAllPublishers();
    }

    @PostMapping("/create")
    public Publisher createPublisher(@RequestBody Publisher publisher) {
        return service.createPublisher(publisher);
    }

    /*@PostMapping("/deneme/create")
    public String deneme() {

        Book book = new Book();
        book.setTitle("Kitap");
        book.setIsbn("325445");
        book.setPrice(250.0);

        Author author = new Author();
        author.setFirstName("Yazar");
        author.setLastName("Soyad");

        Publisher publisher = new Publisher();
        publisher.setName("Yayınevi");

        publisher.setBooks(List.of(book));
        book.setPublisher(publisher);
        book.setAuthor(author);
        author.setBooks(List.of(book));

        service.createPublisher(publisher);
        return "Book: " + book + "\nAuthor: " + author + "\nPublisher: " + publisher;
    }*/

    /*@PostMapping("/deneme/update")
    public String denemeUpdate() {
        Publisher publisher = service.getPublisherById(7L);

        Book book = new Book();
        book.setTitle("2_Kitap");
        book.setIsbn("13256");
        book.setPrice(250.0);

        Book book2 = new Book();
        book2.setTitle("3_Kitap");
        book2.setIsbn("sfs");
        book2.setPrice(250.0);

        Book book3 = new Book();
        book3.setTitle("4_Kitap");
        book3.setIsbn("dsfs");
        book3.setPrice(250.0);

        Author author = new Author();
        author.setFirstName("2_Yazar");
        author.setLastName("2_Soyad");

        Author author2 = new Author();
        author2.setFirstName("3_Yazar");
        author2.setLastName("3_Soyad");

        Author author3 = new Author();
        author3.setFirstName("4_Yazar");
        author3.setLastName("4_Soyad");

        System.out.println(publisher);
        publisher.addBook(book);
        publisher.addBook(book2);
        publisher.addBook(book3);

        book.setPublisher(publisher);
        book2.setPublisher(publisher);
        book3.setPublisher(publisher);

        author.addBook(book);
        author.addBook(book2);
        author.addBook(book3);
        System.out.println(author);

        book.setAuthor(author);
        book2.setAuthor(author);
        book3.setAuthor(author);

        System.out.println(publisher);

        service.updatePublisher(publisher);
        return "Book: " + book + "\nAuthor: " + author + "\nPublisher: " + publisher;
    }*/
}