package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.apollo.ApolloSubBranch;
import com.xworkz.hospitalapp.hospital.Hospital;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Main started");
        Hospital hst = new ApolloSubBranch();
        String ref = hst.hospitalLaws();
        System.out.println("Hospital law: "+ref);
        String ref1 = hst.visitingHours();
        System.out.println("Visiting time: "+ref1);
        int n = hst.policies();
        System.out.println("No. of policies: "+n);
        System.out.println("Main ended");
    }
}
