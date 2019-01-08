package com.example.elasticsearch.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Book dto
 *
 * @author eren
 */
public class BookDto implements Serializable {

    private String isbn;

    private String title;

    private String subtitle;

    private String author;

    private Date published;

    private String publisher;

    private int pages;

    private String description;

    private String website;


    public BookDto(String isbn, String title, String subtitle, String author, Date published, String publisher, int pages, String description, String website) {
        this.isbn = isbn;
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.published = published;
        this.publisher = publisher;
        this.pages = pages;
        this.description = description;
        this.website = website;
    }


}
