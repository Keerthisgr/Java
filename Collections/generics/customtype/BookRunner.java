package com.xworkz.collection.generics.customtype;

import com.xworkz.collection.generics.comparator.AuthorNameComparator;
import com.xworkz.collection.generics.comparator.IdComparator;
import com.xworkz.collection.generics.comparator.PriceComparator;

import java.util.Collections;
import java.util.LinkedList;

public class BookRunner {
    public static void main(String[] args) {
        LinkedList<Book> linkedList = new LinkedList<>();
        linkedList.add(new Book(101,"How to talk to anyone","James john",899.90));
        linkedList.add(new Book(201,"Atomic Habits","James clear",789.90));
        linkedList.add(new Book(103,"Ikegai","Newton",744.90));
        Collections.sort(linkedList);
        for (Object obj : linkedList) {
            System.out.println(obj);
        }
        System.out.println("Sort by Author name");
        Collections.sort(linkedList,new AuthorNameComparator());
        for (Object obj : linkedList) {
            System.out.println(obj);
        }
        System.out.println("Sort by Id");
        Collections.sort(linkedList,new IdComparator());
        for (Object obj : linkedList) {
            System.out.println(obj);
        }
        System.out.println("Sort by price");
        Collections.sort(linkedList,new PriceComparator());
        for (Object obj : linkedList) {
            System.out.println(obj);
        }
    }
}
