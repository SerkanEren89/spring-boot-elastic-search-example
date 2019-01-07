package com.example.elasticsearch.dto;

import lombok.Data;

import java.util.Date;

/**
 * Book dto
 *
 * @author eren
 */
@Data
public class BookDto {

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
