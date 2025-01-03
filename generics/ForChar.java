package com.xworkz.collection.generics;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class ForChar {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('K');
        list.add('E');
        list.add('E');
        list.add('R');
        list.add('T');
        list.add('H');
        list.add('I');
        list.add('S');
        list.add('R');
        Collections.sort(list);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
