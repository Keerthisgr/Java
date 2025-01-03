package com.xworkz.collection.generics.customtype;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book implements Comparable<Book>
{
    private int bookId;
    private String bookName;
    private String authorName;
    private double price;

    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.getBookName());
    }


//    @Override
//    public int compareTo(Book o) {
//        return this.getBookId() - o.getBookId();
//    }
}
