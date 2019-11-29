package by.mifort.controller;

import by.mifort.entity.BookQueue;
import by.mifort.repositories.BookQueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookqueues")
public class BookQueueController {

    @Autowired
    private BookQueueRepository bookQueueRepository;

    @GetMapping
    public List<BookQueue> getListOfBookQueue() {
        return bookQueueRepository.findAll();
    }

    @PostMapping("/user/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestParam(value = "id",
                                required = false) Integer id,
                        @RequestParam(value = "bookId",
                                required = false) Integer bookId,
                        @RequestParam(value = "userId",
                                required = false) Integer userId,
                        @RequestParam(value = "queue",
                                required = false) Integer queue,
                        @RequestParam(value = "createdAt",
                                required = false) String createdAt) {
        System.out.println("bookQueueRepository = "
                + bookQueueRepository);
        bookQueueRepository.addUser(id, bookId,
                userId, queue, createdAt);
    }
}
