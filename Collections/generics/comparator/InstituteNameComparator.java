package com.xworkz.collection.generics.comparator;

import com.xworkz.collection.generics.customtype.Institute;

import java.util.Comparator;

public class InstituteNameComparator implements Comparator<Institute> {
    @Override
    public int compare(Institute o1, Institute o2) {
        return o1.getInstituteName().compareTo(o2.getInstituteName());
    }
}
