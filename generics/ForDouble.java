package com.xworkz.collection.generics;

import com.xworkz.collection.implementationclass.ArrayListTester;

import java.util.ArrayList;
import java.util.Collections;

public class ForDouble {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(899.90);
        list.add(900.90);
        list.add(234.90);
        list.add(450.89);
        list.add(567.89);
        list.add(611.23);
        Collections.sort(list);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
