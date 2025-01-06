package com.xworkz.collection.generics.comparator;

import com.xworkz.collection.generics.customtype.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return (int) (o1.getPrice()-o2.getPrice());
    }
}
