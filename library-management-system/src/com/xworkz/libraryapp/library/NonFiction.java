package com.xworkz.libraryapp.library;

import java.util.ArrayList;
import java.util.Collection;

public class NonFiction {
    public static void main(String[] args) {
        System.out.println("****Collection******");
        Collection collection = new ArrayList();
        collection.add("Atomic Habits");
        collection.add("Think like a Monk");
        System.out.println(collection);

        System.out.println("****collection1****");
        Collection collection1 = new ArrayList();
        collection1.addAll(collection);
        System.out.println(collection1);

        System.out.println("*****hashCode()******");
        System.out.println(collection1.hashCode());

        System.out.println("******equals******");
        System.out.println(collection.equals(collection1));

        System.out.println("******forEach()*******");
        collection1.forEach(System.out::println);

        System.out.println("********containsAll()**********");
        System.out.println(collection1.containsAll(collection));

        System.out.println("*******contains*************");
        System.out.println(collection1.contains("Atomic Habits"));

        System.out.println("******size()*********");
        System.out.println(collection1.size());

        System.out.println("*******retainAll()**********");
        Collection collection3 = new ArrayList();
        collection3.add("Death");
        collection3.add("Atomic Habits");
        collection3.add("Here, there and everywhere");
        System.out.println(collection3);
        System.out.println(collection3.retainAll(collection));
        System.out.println(collection3);


        System.out.println("*****clear()******");
        collection1.clear();

        System.out.println("******remove()**********");
        collection3.remove(collection3);
    }
}
