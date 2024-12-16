package org.sid.bookgraphql.service;

import lombok.NoArgsConstructor;
import org.sid.bookgraphql.dao.entities.Book;
import org.sid.bookgraphql.dao.repositories.BookRepository;
import org.sid.bookgraphql.dto.BookDTO;
import org.sid.bookgraphql.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
public class BookImpl implements BookService{

    private BookRepository bookRepository;
    private BookMapper bookMapper;

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book=bookMapper.fromBookDTOtoBook(bookDTO);
        book= bookRepository.save(book);
        return bookMapper.fromBooktoBookDTO(book);
    }

    @Override
    public List<BookDTO> getBookByTitle(String title) {
        List<Book> books=bookRepository.findByTitle(title);
        List<BookDTO> bookDTOs=new ArrayList<>();
        for(Book book:books){
            bookDTOs.add(bookMapper.fromBooktoBookDTO(book));
        }
        return bookDTOs;
    }
}
