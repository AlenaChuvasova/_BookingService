package by.mifort.controller;

import by.mifort.entity.Book;
import by.mifort.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public Page<Book> getBooks(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "limit", defaultValue = "2") int limit) {
        Pageable p = PageRequest.of(page, limit);
        return bookRepository.findAll(p);
    }

    @GetMapping("/book/{title}")
    public String getStatusByName(@PathVariable String title) {
        return bookRepository.findByTitle(title).getStatus();
    }

    @GetMapping("/{q}")
    public List<Book> getBookByParam(
            @PathVariable(value = "q", required = false) String q) {
        System.out.println("BookController.getBookByParam");
        System.out.println("name = [" + q + "]");
        return bookRepository.search(q);
    }

    @PostMapping(value = "/book/add",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book newBook) {
        return bookRepository.save(newBook);
    }
}
