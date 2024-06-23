package com.anke.Anke_LibraryApp.controller;

import com.anke.Anke_LibraryApp.entity.Publisher;
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

//    @Autowired
//    public PublisherController(BookService bookService, AuthorService authorService, PublisherService service) {
//        this.bookService = bookService;
//        this.authorService = authorService;
//        this.service = service;
//    }

    @GetMapping
    public List<Publisher> getAllPublishers() {
        return service.getAllPublishers();
    }

    @PostMapping("/create")
    public Publisher createPublisher(@RequestBody Publisher publisher) {
        return service.createPublisher(publisher);
    }

   /* @PostMapping("/deneme/create")
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
        System.out.println(publisher);
        book.setPublisher(publisher);
        System.out.println(book);
        book.setAuthor(author);
        System.out.println(book);
        author.setBooks(List.of(book));
        System.out.println(author);

        service.createPublisher(publisher);
        return "Book: " + book + "\nAuthor: " + author + "\nPublisher: " + publisher;
    }

    @PostMapping("/deneme/update")
    public String denemeUpdate() {
        Publisher publisher = service.getPublisherById(1L);

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

        publisher.addBook(book2);
        publisher.addBook(book3);
        System.out.println(publisher);
        //book.setPublisher(publisher);
        System.out.println(book2);
        book2.setAuthor(author2);
        System.out.println(book2);
        author2.setBooks(List.of(book2));
        System.out.println(author2);
        book3.setAuthor(author3);
        System.out.println(book3);
        author3.setBooks(List.of(book3));
        System.out.println(author3);

        service.createPublisher(publisher);
        return "Book: " + book + "\nAuthor: " + author + "\nPublisher: " + publisher;
    }*/
}