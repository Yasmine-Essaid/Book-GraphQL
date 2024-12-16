package org.sid.bookgraphql.mapper;

import org.modelmapper.ModelMapper;
import org.sid.bookgraphql.dao.entities.Book;
import org.sid.bookgraphql.dto.BookDTO;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    private final ModelMapper modelMapper=new ModelMapper();

    public BookDTO  fromBooktoBookDTO(Book book) {
        return modelMapper.map(book, BookDTO.class);
    }

    public Book fromBookDTOtoBook(BookDTO bookDTO) {
        return modelMapper.map(bookDTO, Book.class);
    }
}
