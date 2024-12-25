package com.xworkz.collection.implementationclass;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListTester {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(23);
        collection.add(45);
        collection.add(67);
        collection.add(89);
        collection.add(12);
        collection.add(890);
        collection.add(678);
        collection.add(657);
        collection.add(789);
        collection.add(123);
        System.out.println("Array List");
        System.out.println(collection);
    }
}
