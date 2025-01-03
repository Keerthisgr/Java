package com.xworkz.collection.generics;

import java.util.Collections;
import java.util.LinkedList;

public class ForString {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Kavana");
        list.add("Kavya");
        list.add("Kaveri");
        list.add("Aradhana");
        list.add("Adhya");
        list.add("Akshatha");
        Collections.sort(list);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
