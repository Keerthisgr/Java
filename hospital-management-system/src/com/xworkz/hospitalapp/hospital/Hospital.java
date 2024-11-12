package com.xworkz.hospitalapp.hospital;

public class Hospital {
    private String name;
    public Hospital() {
        System.out.println("Hospital's Default Constructor is invoked!!...");
    }
    public void HospitalInfo(String name){
        this.name = name;
        System.out.println("Hospital name: "+this.name);
    }
}
