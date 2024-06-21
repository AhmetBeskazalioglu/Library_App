package com.anke.Anke_LibraryApp.repository;

import com.anke.Anke_LibraryApp.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
