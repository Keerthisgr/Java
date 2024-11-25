package com.xworkz.bookapp.bookHouse;

import com.xworkz.bookapp.booktype.BookType;
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
