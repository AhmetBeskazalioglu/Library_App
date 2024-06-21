package com.anke.Anke_LibraryApp.controller;

import com.anke.Anke_LibraryApp.entity.Publisher;
import com.anke.Anke_LibraryApp.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

    private PublisherService service;

    @Autowired
    public PublisherController(PublisherService service) {
        this.service = service;
    }

    @GetMapping
    public List<Publisher> getAllPublishers() {
        return service.getAllPublishers();
    }

    @PostMapping("/create")
    public Publisher createPublisher(@RequestBody Publisher publisher) {
        return service.createPublisher(publisher);
    }
}