package com.xworkz.libraryapp.library;

import java.util.ArrayList;
import java.util.Collection;

public class LibraryRunner {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookId(56);
        book.setBookName("Health");
        book.setAuthorName("James");
        book.setPrice(800.90);

        Collection collection = new ArrayList();
        collection.add(book);
        System.out.println(collection);

        Collection collection1 = new ArrayList();
        collection1.addAll(collection);

        System.out.println(collection1);

        System.out.println(collection.hashCode());

        collection.forEach(System.out::println);

        System.out.println("***equals()***");
        System.out.println(collection.equals(collection1));

        System.out.println("****contains*****");
        System.out.println(collection1.contains(book));

        System.out.println("****containsAll*****");
        System.out.println(collection.containsAll(collection1));

        System.out.println("***hashCode***");
        System.out.println(collection.hashCode());

        System.out.println("****clear****");
       collection.clear();

    }
}
