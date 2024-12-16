package org.sid.bookgraphql.dao.repositories;

import org.sid.bookgraphql.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository  extends JpaRepository<Book, Long> {
    public List<Book> findByTitle(String title);
}
