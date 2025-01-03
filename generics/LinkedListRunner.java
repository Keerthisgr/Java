package com.xworkz.collection.generics;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(67);
        list.add(89);
        list.add(97);
        list.add(56);
        Collections.sort(list);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
