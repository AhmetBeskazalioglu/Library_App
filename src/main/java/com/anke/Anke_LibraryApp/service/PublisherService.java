package com.anke.Anke_LibraryApp.service;

import com.anke.Anke_LibraryApp.entity.Publisher;
import com.anke.Anke_LibraryApp.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    private PublisherRepository repository;

    @Autowired
    public PublisherService(PublisherRepository repository) {
        this.repository = repository;
    }

    public List<Publisher> getAllPublishers() {
        return repository.findAll();
    }

    public Publisher createPublisher(Publisher publisher) {
        return repository.save(publisher);
    }
}
