package com.xworkz.tabapp;

import com.xworkz.tabapp.tab.Tab;

public class TabRunner{
    public static void main(String[] args) {
        Tab t = new Tab();
        t.setModel("Samsung");
        t.setPrice(6789.99);
        t.setModelId(3457);
//        System.out.println(t.getModel());
//        System.out.println(t.getPrice());
        System.out.println(t);

        Tab t1 = new Tab();
        t1.setModel("Samsung");
        t1.setPrice(6789.99);
        t1.setModelId(3457);

        System.out.println(t.hashCode());
        System.out.println(t1.hashCode());

        boolean isSame = t.equals(t1);
        System.out.println(isSame);
    }
}
