package com.xworkz.collection.generics.comparator;

import com.xworkz.collection.generics.customtype.Book;

import java.util.Comparator;

public class IdComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookId() - o2.getBookId();
    }
}
