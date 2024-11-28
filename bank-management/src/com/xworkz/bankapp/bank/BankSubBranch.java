package com.xworkz.bankapp.bank;

public class BankSubBranch extends Bank{

    @Override
    public void customerPrivacy() {
        System.out.println("Customer privacy");
    }

    @Override
    public void secureTransaction() {
        System.out.println("Secure Transaction");
    }

    @Override
    public void regularAudits() {
        System.out.println("Regular Audits");
    }

    @Override
    public void fraudPrevention() {
        System.out.println("Fraud prevention");
    }

    @Override
    public void csrCompliance() {
        System.out.println("CSR Compliance");
    }
}
