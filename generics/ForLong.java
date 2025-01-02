package com.xworkz.collection.generics;

import java.util.HashSet;

public class ForLong {
    public static void main(String[] args) {
        HashSet<Long> list = new HashSet<>();
        list.add(8088167869847l);
        list.add(9686114567934l);
        list.add(4567456766578l);
        list.add(8987667346289l);
        list.add(9088977658688l);
        list.add(7835566488387l);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
