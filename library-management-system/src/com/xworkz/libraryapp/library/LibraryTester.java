package com.xworkz.libraryapp.library;

import java.util.ArrayList;
import java.util.Collection;

public class LibraryTester {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookId(567);
        book.setBookName("Here, there and everywhere");
        book.setAuthorName("Sudhamurthy");
        book.setPrice(780.90);

        Book book2 = new Book();
        book2.setBookId(578);
        book2.setBookName("Death");
        book2.setAuthorName("Sadhguru");
        book2.setPrice(880.90);

        Collection collection = new ArrayList();
        collection.add(book);
        collection.add(book2);
        System.out.println(collection);

        Collection collection1 = new ArrayList();
        collection1.addAll(collection);

        System.out.println("****forEach()****");
        collection.forEach(System.out::println);

        System.out.println("***equals()***");
        System.out.println(book.equals(book2));
        System.out.println(collection.equals(book2));
        System.out.println(collection.equals(collection1));

        System.out.println("***hashCode***");
        System.out.println(book.hashCode());
        System.out.println(collection.hashCode());


        System.out.println("******clear**********");
        collection.clear();

    }
}
