package org.sid.bookgraphql.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BookDTO {
    private String title;
    private String publisher;
    private Date datePublication;
    private double price;
    private String resume;
}
