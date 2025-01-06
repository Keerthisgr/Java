package com.xworkz.collection.generics.comparator;

import com.xworkz.collection.generics.customtype.Gmail;

import java.util.Comparator;

public class FromAddressComparator implements Comparator<Gmail> {
    @Override
    public int compare(Gmail o1, Gmail o2) {
        return o1.getFromAddress().compareTo(o2.getFromAddress());
    }
}
