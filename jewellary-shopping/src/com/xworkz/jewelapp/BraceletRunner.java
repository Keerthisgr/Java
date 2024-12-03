package com.xworkz.jewelapp;

import com.xworkz.jewelapp.bracelet.Bracelet;

public class BraceletRunner {
    public static void main(String[] args) {
                Bracelet brac = new Bracelet();
                brac.setMaterialType("Metal");
                brac.setMetalType("Yellow Gold");
                brac.setSize("Standard");
                brac.setGemType("Diamond");
                brac.setCountryOfOrigin("India");
//                System.out.println(brac.getMetalType());
//                System.out.println(brac.getMaterialType());
//                System.out.println(brac.getGemType());
//                System.out.println(brac.getSize());
//                System.out.println(brac.getCountryOfOrigin());

        System.out.println(brac);
            }
}
