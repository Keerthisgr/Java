package com.xworkz.jewellaryapp;

import com.xworkz.jewellaryapp.earring.Earring;

public class EarringRunner {
    public static void main(String[] args) {
        Earring ear = new Earring();
        ear.setMaterialType("Metal");
        ear.setMetalType("Yellow Gold");
        ear.setGemType("Diamond");
        ear.setCountryOfOrigin("India");
//        System.out.println("Material Type: "+ear.getMaterialType());
//        System.out.println("Metal Type: "+ear.getMetalType());
//        System.out.println("Gem Type: "+ear.getGemType());
//        System.out.println("Country of Origin: "+ear.getCountryOfOrigin());
        System.out.println(ear);
    }
}
