package com.xworkz.tabapp;

import com.xworkz.tabapp.tab.Tab;

public class TabRunner{
    public static void main(String[] args) {
        Tab t = new Tab();
        t.setModel("Samsung");
        t.setPrice(6789.99);
//        System.out.println(t.getModel());
//        System.out.println(t.getPrice());
        System.out.println(t);
    }
}
