package com.example.elasticsearch.service.impl;

import com.example.elasticsearch.dto.BookDto;
import com.example.elasticsearch.mapper.BookMapper;
import com.example.elasticsearch.model.Book;
import com.example.elasticsearch.repository.BookRepository;
import com.example.elasticsearch.service.BookService;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.elasticsearch.index.query.QueryBuilders.multiMatchQuery;

/**
 * Book service implementation
 *
 * @author eren
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;
    private final ElasticsearchTemplate esTemplate;

    public BookServiceImpl(BookRepository bookRepository,
                           BookMapper bookMapper,
                           ElasticsearchTemplate esTemplate) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
        this.esTemplate = esTemplate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookDto getBookById(final Long id) {
        return bookRepository.findById(id).map(bookMapper::toBookDto).orElse(null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<BookDto> createBookList(List<BookDto> bookDtoList){
        List<Book> bookList = bookDtoList.stream().map(bookMapper::toBook).collect(Collectors.toList());
        bookList.forEach(book -> book.setId(new Random().nextLong()));
        return StreamSupport.stream(bookRepository.saveAll(bookList).spliterator(), false)
                .map(bookMapper::toBookDto)
                .collect(Collectors.toList());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<BookDto> search(String searchTerm) {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(multiMatchQuery(searchTerm,"title", "author", "description").minimumShouldMatch("75%"))
                .build();
        return esTemplate.queryForList(searchQuery, Book.class)
                .stream().map(bookMapper::toBookDto).collect(Collectors.toList());
    }
}
