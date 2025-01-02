package com.xworkz.collection.generics;

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
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
