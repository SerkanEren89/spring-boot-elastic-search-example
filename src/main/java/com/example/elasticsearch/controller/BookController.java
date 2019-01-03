package com.example.elasticsearch.controller;

import com.example.elasticsearch.dto.BookDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Book controller
 *
 * @author eren
 */
@Log4j2
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public List<BookDto> getAllBooks() {
        log.info("Getting all books");
        return null;
    }

    @GetMapping("{bookId}")
    public List<BookDto> getBookById(@PathVariable("bookId") Long bookId) {
        log.info("Get book by id: {}", bookId);
        return null;
    }
}
