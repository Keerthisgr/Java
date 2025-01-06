package com.xworkz.collection.generics.comparator;

import com.xworkz.collection.generics.customtype.Institute;

import java.util.Comparator;

public class TraineeComparator implements Comparator<Institute> {
    @Override
    public int compare(Institute o1, Institute o2) {
        return o1.getNumberOfTrainee()-o2.getNumberOfTrainee();
    }
}
