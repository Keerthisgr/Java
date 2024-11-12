package com.xworkz.companyapp.company;

public class Company {
    private String companyName;

    public Company() {
        System.out.println("Default constructor of company is invoked");
    }

    public void companyInfo(String companyName){
        this.companyName = companyName;
        System.out.println("Company name is: "+this.companyName);
    }
}
