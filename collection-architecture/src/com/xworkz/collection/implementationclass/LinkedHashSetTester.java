package com.xworkz.collection.implementationclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class LinkedHashSetTester {
    public static void main(String[] args) {
        Collection collection = new LinkedHashSet();
        collection.add(67);
        collection.add(89);
        collection.add(789);
        collection.add(890);
        collection.add(678);
        collection.add(23);
        collection.add(7856);
        collection.add(45);
        collection.add(987);
        collection.add(12);
        System.out.println("Linked hash set");
        System.out.println(collection);
    }
}
