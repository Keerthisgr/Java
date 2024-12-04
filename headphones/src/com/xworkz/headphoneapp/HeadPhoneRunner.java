package com.xworkz.headphoneapp;

import com.xworkz.headphoneapp.headphone.Headphone;

public class HeadPhoneRunner {
    public static void main(String[] args) {
        Headphone hp = new Headphone();
        hp.setBrand("Bolt");
        hp.setPrice(8900);
        Headphone hp1 = new Headphone();
        hp1.setBrand("Bolt");
        hp1.setPrice(8900);
//        System.out.println(hp.getBrand());
//        System.out.println(hp.getPrice());

        System.out.println(hp);

        boolean same = hp.equals(hp1);
        System.out.println(same);

        //hashcode return unique number of that perticular address

        System.out.println(hp.hashCode());
        System.out.println(hp1.hashCode());

    }
}
