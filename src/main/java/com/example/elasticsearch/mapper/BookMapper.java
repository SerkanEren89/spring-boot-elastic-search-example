package com.example.elasticsearch.mapper;

import com.example.elasticsearch.dto.BookDto;
import com.example.elasticsearch.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Book mapper
 *
 * @author eren
 */
@Mapper(componentModel = "Spring")
public interface BookMapper {

    @Mapping(ignore = true, target = "id")
    Book toBook(BookDto bookDto);

    BookDto toBookDto(Book book);
}
