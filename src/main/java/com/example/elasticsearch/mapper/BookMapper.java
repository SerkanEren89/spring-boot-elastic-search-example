package com.example.elasticsearch.mapper;

import com.example.elasticsearch.dto.BookDto;
import com.example.elasticsearch.model.Book;
import org.mapstruct.Mapper;

/**
 * Book mapper
 *
 * @author eren
 */
@Mapper(componentModel = "Spring")
public interface BookMapper {

    Book toBook(BookDto bookDto);

    BookDto toBookDto(Book book);
}
