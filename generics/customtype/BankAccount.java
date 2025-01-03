package com.xworkz.collection.generics.customtype;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class BankAccount implements Comparable<BankAccount>{
    private int accountNumber;
    private String accountType;
    private String accoundHolderName;

    @Override
    public int compareTo(BankAccount o) {
        return this.getAccountNumber() - o.getAccountNumber();
    }
}
