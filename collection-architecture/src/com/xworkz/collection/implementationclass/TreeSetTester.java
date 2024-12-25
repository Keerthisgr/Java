package com.xworkz.collection.implementationclass;

import java.util.Collection;
import java.util.TreeSet;
import java.util.Vector;

public class TreeSetTester {
    public static void main(String[] args) {
        Collection collection = new TreeSet();
        collection.add(789);
        collection.add(23);
        collection.add(7856);
        collection.add(45);
        collection.add(67);
        collection.add(89);
        collection.add(987);
        collection.add(12);
        collection.add(890);
        collection.add(678);
        System.out.println("Tree set");
        System.out.println(collection);
    }
}
