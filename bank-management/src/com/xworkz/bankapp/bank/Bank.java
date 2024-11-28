package com.xworkz.bankapp.bank;

public abstract class Bank implements BankGuidelines{

    @Override
    public void mustHaveBankAccount() {
        System.out.println("Must have bank account");
    }

    @Override
    public void kyc() {
        System.out.println("KYC");
    }

    @Override
    public void atm() {
        System.out.println("ATM");
    }

    @Override
    public void digitalTransformation() {
        System.out.println("Digital Trasformation");
    }

    @Override
    public void creditCard() {
        System.out.println("Credit card");
    }

    @Override
    public void secureAccountDetails() {
        System.out.println("Secure Account Details");
    }

    @Override
    public void transparencyInCommunication() {
        System.out.println("Trasparency in communication");
    }
    @Override
    public void cyberSecurityFramework() {
        System.out.println("Cyber security framework");
    }

    @Override
    public void serviceAvailability() {
        System.out.println("Service availability");
    }

    @Override
    public void liquidityManagement() {
        System.out.println("Liquidity management");
    }
}
