package com.xworkz.companyapp;

import com.xworkz.companyapp.cognizant.Cognizant;
import com.xworkz.companyapp.company.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Company com = new Cognizant();
        com.companyInfo("IBM");
        System.out.println("Main ended");
    }
}
