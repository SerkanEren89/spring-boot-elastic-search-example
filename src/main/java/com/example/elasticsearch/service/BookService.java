package com.example.elasticsearch.service;

import com.example.elasticsearch.dto.BookDto;

import java.util.List;

/**
 * Book service interface
 *
 * @author eren
 */
public interface BookService {

    /**
     * Get book by id
     *
     * @param id id
     * @return return book dto
     */
    BookDto getBookById(Long id);

    /**
     * Create book list
     *
     * @param bookDtoList book dto list
     * @return return book dto list
     */
    List<BookDto> createBookList(List<BookDto> bookDtoList);

    /**
     * Search books
     *
     * @param searchTerm search term
     * @return list of book dto
     */
    List<BookDto> search(String searchTerm);
}
