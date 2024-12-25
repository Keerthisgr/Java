package com.xworkz.collection.implementationclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListTester {
    public static void main(String[] args) {
        Collection collection = new LinkedList();
        collection.add(89);
        collection.add(789);
        collection.add(675);
        collection.add(900);
        collection.add(45);
        collection.add(67);
        collection.add(89);
        collection.add(12);
        collection.add(890);
        collection.add(678);
        System.out.println("Linked list");
        System.out.println(collection);
    }
}
