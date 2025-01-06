package com.xworkz.collection.generics.customtype;

import com.xworkz.collection.generics.comparator.AccountHolderComparator;
import com.xworkz.collection.generics.comparator.AccountTypeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccountRunner {
    public static void main(String[] args) {
        List<BankAccount> bankAccount = new ArrayList<>();
        bankAccount.add(new BankAccount(3456778,"Savings","Keerthi S R"));
        bankAccount.add(new BankAccount(67899798,"Salary account","Kiran Kumar S R"));
        bankAccount.add(new BankAccount(78900987,"Current Account","Sandhya K R"));
        Collections.sort(bankAccount);
        for (Object obj : bankAccount) {
            System.out.println(obj);
        }
        System.out.println("Sort by Account holder name");
        Collections.sort(bankAccount,new AccountHolderComparator());
        for (Object obj : bankAccount) {
            System.out.println(obj);
        }
        System.out.println("Sort by account type");
        Collections.sort(bankAccount,new AccountTypeComparator());
        for (Object obj : bankAccount) {
            System.out.println(obj);
        }
    }
}
