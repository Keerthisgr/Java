package com.xworkz.collection.generics.customtype;

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
    }
}
