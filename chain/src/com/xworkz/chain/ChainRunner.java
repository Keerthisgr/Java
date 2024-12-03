package com.xworkz.chain;

import com.xworkz.chain.chain.Chain;

public class ChainRunner {
    public static void main(String[] args) {
        Chain c = new Chain();
        c.setMaterialType("Metal");
        c.setMetalType("Yellow Gold");
        c.setGemType("Diamond");
//        System.out.println("Material Type: "+c.getMaterialType());
//        System.out.println("Metal Type: "+c.getMetalType());
//        System.out.println("Gem Type: "+c.getGemType());
        System.out.println(c);
    }
}
