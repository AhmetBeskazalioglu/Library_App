package com.anke.Anke_LibraryApp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(cascade =CascadeType.ALL,orphanRemoval = true,
            mappedBy = "publisher",fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Book> books;

}

