package com.xworkz.libraryapp.library;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    private double price;
}
