package org.sid.bookgraphql.service;

import org.sid.bookgraphql.dto.BookDTO;

import java.util.List;

public interface BookService {
   public BookDTO saveBook(BookDTO book);
   public List<BookDTO> getBookByTitle(String title);
}
