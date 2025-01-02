package com.xworkz.collection.generics.customtype;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class BankAccount {
    private int accountNumber;
    private String accountType;
    private String accoundHolderName;
}
