package com.example.elasticsearch.repository;

import com.example.elasticsearch.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Elastic search book repository
 *
 * @author eren
 */
public interface BookRepository extends ElasticsearchRepository<Book, Long> {
}
