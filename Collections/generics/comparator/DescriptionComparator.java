package com.xworkz.collection.generics.comparator;

import com.xworkz.collection.generics.customtype.Gmail;

import java.util.Comparator;

public class DescriptionComparator implements Comparator<Gmail> {
    @Override
    public int compare(Gmail o1, Gmail o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }
}
