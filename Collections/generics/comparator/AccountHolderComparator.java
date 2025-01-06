package com.xworkz.collection.generics.comparator;

import com.xworkz.collection.generics.customtype.BankAccount;

import java.util.Comparator;

public class AccountHolderComparator implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        return o1.getAccoundHolderName().compareTo(o2.getAccoundHolderName());
    }
}
