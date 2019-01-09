package com.example.elasticsearch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Book dto
 *
 * @author eren
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
