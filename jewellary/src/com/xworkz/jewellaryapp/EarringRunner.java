package com.xworkz.jewellaryapp;

import com.xworkz.jewellaryapp.earring.Earring;

public class EarringRunner {
    public static void main(String[] args) {
        Earring ear = new Earring();
        ear.setMaterialType("Metal");
        ear.setMetalType("Yellow Gold");
        ear.setGemType("Diamond");
        ear.setCountryOfOrigin("India");
        ear.setModelId(89);
//        System.out.println("Material Type: "+ear.getMaterialType());
//        System.out.println("Metal Type: "+ear.getMetalType());
//        System.out.println("Gem Type: "+ear.getGemType());
//        System.out.println("Country of Origin: "+ear.getCountryOfOrigin());
        System.out.println(ear);

        Earring ear1 = new Earring();
        ear1.setMaterialType("Metal");
        ear1.setMetalType("Yellow Gold");
        ear1.setGemType("Diamond");
        ear1.setCountryOfOrigin("India");
        ear1.setModelId(89);

        System.out.println(ear.hashCode());
        System.out.println(ear1.hashCode());

        boolean isSame = ear.equals(ear1);
        System.out.println(isSame);
    }
}
