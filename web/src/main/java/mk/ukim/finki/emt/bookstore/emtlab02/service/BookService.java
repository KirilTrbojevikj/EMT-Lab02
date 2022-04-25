package mk.ukim.finki.emt.bookstore.emtlab02.service;

import mk.ukim.finki.emt.bookstore.emtlab02.model.Author;
import mk.ukim.finki.emt.bookstore.emtlab02.model.Book;
import mk.ukim.finki.emt.bookstore.emtlab02.model.BookDto;
import mk.ukim.finki.emt.bookstore.emtlab02.model.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> findByName(String name);

    Optional<Book> save(String name, Category category, Long authorId, Integer availableCopies);

    Optional<Book> save(BookDto productDto);

    Optional<Book> edit(Long id, String name, Category category, Author author, Integer availableCopies);

    Optional<Book> edit(Long id, BookDto productDto);

    void deleteById(Long id);

}
