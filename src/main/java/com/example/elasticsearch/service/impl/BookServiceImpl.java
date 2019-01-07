package com.example.elasticsearch.service.impl;

import com.example.elasticsearch.dto.BookDto;
import com.example.elasticsearch.mapper.BookMapper;
import com.example.elasticsearch.repository.BookRepository;
import com.example.elasticsearch.service.BookService;
import org.springframework.stereotype.Service;

/**
 * Book service implementation
 *
 * @author eren
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookServiceImpl(BookRepository bookRepository,
                           BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookDto getBookById(Long id) {
        return bookRepository.findById(id).map(bookMapper::toBookDto).orElse(null);
    }
}
