package mk.ukim.finki.emt.bookstore.emtlab02.model;

import lombok.Data;


import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    private Integer availableCopies;

    public Book() {
    }

    public Book(Long id, String name, Author author, Integer availableCopies) {
        this.name = name
        this.author = author;
        this.availableCopies = availableCopies;
    }

}