package com.xworkz.jewapp.jewellary;

public class BraceletRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Bracelet brac = new Bracelet();
        brac.setMaterialType("Metal");
        brac.setMetalType("Yellow Gold");
        brac.setSize("Standard");
        brac.setGemType("Diamond");
        brac.setCountryOfOrigin("India");
        brac.setModelId(4582);

        Bracelet brac1 = new Bracelet();
        brac1.setMaterialType("Metal");
        brac1.setMetalType("Yellow Gold");
        brac1.setSize("Standard");
        brac1.setGemType("Diamond");
        brac1.setCountryOfOrigin("India");
        brac1.setModelId(4582);

        System.out.println(brac);

        System.out.println(brac.hashCode());
        System.out.println(brac1.hashCode());

        boolean isSame = brac.equals(brac1);
        System.out.println(isSame);


        System.out.println("Main ended");
    }
}
