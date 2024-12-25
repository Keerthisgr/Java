package com.xworkz.collection.implementationclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class VectorTester {
    public static void main(String[] args) {
        Collection collection = new Vector();
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
        System.out.println("Vector");
        System.out.println(collection);
    }
}
