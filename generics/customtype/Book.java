package com.xworkz.collection.generics.customtype;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    private double price;
}
