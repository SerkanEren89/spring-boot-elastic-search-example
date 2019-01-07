package com.example.elasticsearch.controller;

import com.example.elasticsearch.dto.BookDto;
import com.example.elasticsearch.service.BookService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Book controller
 *
 * @author eren
 */
@Log4j2
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{bookId}")
    public BookDto getBookById(@PathVariable("bookId") Long bookId) {
        log.info("Get book by id: {}", bookId);
        return bookService.getBookById(bookId);
    }
}
