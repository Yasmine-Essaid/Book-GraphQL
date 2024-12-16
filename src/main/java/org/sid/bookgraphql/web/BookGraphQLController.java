package org.sid.bookgraphql.web;

import lombok.NoArgsConstructor;
import org.sid.bookgraphql.dto.BookDTO;
import org.sid.bookgraphql.service.BookService;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@NoArgsConstructor
public class BookGraphQLController {

    private BookService bookService;

    @QueryMapping
    public List<BookDTO> getBookByTilte(String title) {
        return bookService.getBookByTitle(title);
    }

    @MutationMapping
    public BookDTO saveBook(BookDTO bookDTO) {
        return bookService.saveBook(bookDTO);
    }

}
