package com.xworkz.collection.generics.customtype;

import java.util.ArrayList;

public class BankAccountRunner {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankAccount = new ArrayList<>();
        bankAccount.add(new BankAccount(3456778,"Savings","Keerthi S R"));
        bankAccount.add(new BankAccount(67899798,"Salary account","Kiran Kumar S R"));
        bankAccount.add(new BankAccount(78900987,"Current Account","Sandhya K R"));
        for (Object obj : bankAccount) {
            System.out.println(obj);
        }
    }
}
