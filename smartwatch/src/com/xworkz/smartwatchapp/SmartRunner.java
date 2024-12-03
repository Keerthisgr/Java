package com.xworkz.smartwatchapp;

import com.xworkz.smartwatchapp.smart.Smart;

public class SmartRunner {
    public static void main(String[] args) {
        Smart sw = new Smart();
        sw.setCaseDiameter("36 Millimetres");
        sw.setBandColor("Black");
        sw.setItemWeight("300 Grams");
        sw.setCountryOfOrigin("India");
//        System.out.println("Case Diameter: "+sw.getCaseDiameter());
//        System.out.println("Band Color: "+sw.getBandColor());
//        System.out.println("Item Weight: "+sw.getItemWeight());
//        System.out.println("Country of Origin: "+sw.getCountryOfOrigin());

        System.out.println(sw);
    }
}
