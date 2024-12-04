package com.xworkz.chain;

import com.xworkz.chain.chain.Chain;

public class ChainRunner {
    public static void main(String[] args) {
        Chain c = new Chain();
        c.setMaterialType("Metal");
        c.setMetalType("Yellow Gold");
        c.setGemType("Diamond");
        c.setModelId(345);
//        System.out.println("Material Type: "+c.getMaterialType());
//        System.out.println("Metal Type: "+c.getMetalType());
//        System.out.println("Gem Type: "+c.getGemType());
        System.out.println(c);
        Chain c1 = new Chain();
        c1.setMaterialType("Metal");
        c1.setMetalType("Yellow Gold");
        c1.setGemType("Diamond");
        c1.setModelId(345);

        System.out.println(c.hashCode());
        System.out.println(c1.hashCode());

        boolean isSame = c.equals(c1);
        System.out.println(isSame);


    }
}
