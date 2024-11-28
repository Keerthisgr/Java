package com.xworkz.bankapp.bank;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main started");
        BankGuidelines bg = new BankSubBranch();
        bg.creditCard();
        bg.customerPrivacy();
        bg.csrCompliance();
        bg.atm();
        bg.kyc();
        bg.digitalTransformation();
        bg.liquidityManagement();
        bg.fraudPrevention();
        bg.mustHaveBankAccount();
        bg.regularAudits();
        bg.transparencyInCommunication();
        System.out.println("Main ended");
    }
}
