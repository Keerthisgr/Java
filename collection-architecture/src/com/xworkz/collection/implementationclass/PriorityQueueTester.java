package com.xworkz.collection.implementationclass;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Vector;

public class PriorityQueueTester {
    public static void main(String[] args) {
        Collection collection = new PriorityQueue();
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
        System.out.println("Priority queue");
        System.out.println(collection);
    }
}
