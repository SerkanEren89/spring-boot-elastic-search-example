package com.example.elasticsearch.service;

import com.example.elasticsearch.dto.BookDto;

/**
 * Book service interface
 *
 * @author eren
 */
public interface BookService {

    /**
     * Get book by id
     * @param id id
     * @return return book dto
     */
    BookDto getBookById(Long id);
}
