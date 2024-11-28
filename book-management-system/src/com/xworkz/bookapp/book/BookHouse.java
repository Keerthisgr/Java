package com.xworkz.bookapp.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookHouse {
    private int bookId;
    private String bookName;
    private String authorName;
    private double price;
    private BookType bookType;
}
