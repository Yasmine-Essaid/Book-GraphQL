package org.sid.bookgraphql.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Book {
    @Id
    @GeneratedValue
    private Long id_Book;
    private String title;
    private String publisher;
    private Date datePublication;
    private double price;
    private String resume;
}
