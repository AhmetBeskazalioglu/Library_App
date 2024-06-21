package com.anke.Anke_LibraryApp.repository;

import com.anke.Anke_LibraryApp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

