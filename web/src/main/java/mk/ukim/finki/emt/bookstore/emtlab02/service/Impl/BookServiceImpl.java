package mk.ukim.finki.emt.bookstore.emtlab02.service.Impl;

import mk.ukim.finki.emt.bookstore.emtlab02.model.Author;
import mk.ukim.finki.emt.bookstore.emtlab02.model.Book;
import mk.ukim.finki.emt.bookstore.emtlab02.model.BookDto;
import mk.ukim.finki.emt.bookstore.emtlab02.model.Category;
import mk.ukim.finki.emt.bookstore.emtlab02.model.exceptions.AuthorNotFoundException;
import mk.ukim.finki.emt.bookstore.emtlab02.repository.AuthorRepository;
import mk.ukim.finki.emt.bookstore.emtlab02.repository.BookRepository;
import mk.ukim.finki.emt.bookstore.emtlab02.repository.CountryRepository;
import mk.ukim.finki.emt.bookstore.emtlab02.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CountryRepository countryRepository;

    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository, CountryRepository countryRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.countryRepository = countryRepository;
    }


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return this.bookRepository.findById(id);
    }

    @Override
    public Optional<Book> findByName(String name) {
        return this.bookRepository.findByName(name);
    }

    @Override
    public Optional<Book> save(String name, Long authorId, Integer availableCopies) {

        Author author = this.authorRepository.findById(authorId)
                .orElseThrow(() -> new AuthorNotFoundException(authorId));


        this.bookRepository.deleteByName(name);
        Book book = new Book(name,author,availableCopies);
        this.bookRepository.save(book);


        return Optional.of(book);
    }

    @Override
    public Optional<Book> save(BookDto productDto) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> edit(Long id, String name, Author author, Integer availableCopies) {
        return Optional.empty();
    }

    @Override
    public Optional<Book> edit(Long id, BookDto productDto) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        this.bookRepository.deleteById(id);
    }
}
