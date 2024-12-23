package com.xworkz.libraryapp.library;

import java.util.ArrayList;
import java.util.Collection;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookId(101);
        book.setBookName("Atomic habits");
        book.setAuthorName("James clear");
        book.setPrice(450.90);

        Collection collection = new ArrayList();
        collection.add(book);
        System.out.println(collection);

        Collection collection1 = new ArrayList();
        collection1.addAll(collection);
        collection1.add(book);
        System.out.println(collection1);

        System.out.println("Size()");
        System.out.println(collection1.size());

        System.out.println("****hashCode()*********");
        System.out.println(collection.hashCode());

        System.out.println("****retainAll()*******");
        System.out.println(collection.retainAll(collection1));

        System.out.println("******equals()*******");
        System.out.println(collection1.equals(collection));

        System.out.println("********containsAll()**********");
        System.out.println(collection1.containsAll(collection));

        System.out.println("*****contains()********");
        System.out.println(collection1.contains(book));

        System.out.println("***hashCode()***");
        System.out.println(collection.hashCode());

        System.out.println("*****remove*****");
        System.out.println(collection.remove(book));

    }
}
