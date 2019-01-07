package com.example.elasticsearch.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * Book index
 *
 * @author eren
 */
@Document(indexName = "books", type = "book")
@Data
@NoArgsConstructor
public class Book {

    @Id
    private Long id;

    private String isbn;

    private String title;

    private String subtitle;

    private String author;

    private Date published;

    private String publisher;

    private int pages;

    private String description;

    private String website;
}
