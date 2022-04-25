package mk.ukim.finki.emt.bookstore.emtlab02.web.rest;

import mk.ukim.finki.emt.bookstore.emtlab02.service.BookService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/api/books")
public class BookRestController {

    private final BookService bookService;


    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }
}
