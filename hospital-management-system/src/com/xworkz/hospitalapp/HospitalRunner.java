package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.apollohospital.Apollo;
import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("Main started!!");
        Hospital hsp = new Apollo();
        hsp.HospitalInfo("Spandana");
        System.out.println("Main ended!!");
    }
}
