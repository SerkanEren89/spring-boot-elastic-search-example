package com.example.elasticsearch.controller;

import com.example.elasticsearch.dto.BookDto;
import com.example.elasticsearch.service.BookService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Book controller
 *
 * @author eren
 */
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{bookId}")
    public BookDto getBookById(@PathVariable("bookId") final Long bookId) {
        return bookService.getBookById(bookId);
    }

    @PostMapping
    public ResponseEntity<List<BookDto>> createBookList(@RequestBody final List<BookDto> bookDtoList) {
        return new ResponseEntity<>(bookService.createBookList(bookDtoList), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BookDto>> searchBooks(@RequestParam final String searchTerm) {
        return new ResponseEntity<>(bookService.search(searchTerm), HttpStatus.OK);
    }
}
