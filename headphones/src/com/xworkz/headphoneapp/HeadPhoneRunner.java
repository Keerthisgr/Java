package com.xworkz.headphoneapp;

import com.xworkz.headphoneapp.headphone.Headphone;

public class HeadPhoneRunner {
    public static void main(String[] args) {
        Headphone hp = new Headphone();
        hp.setBrand("Bolt");
        hp.setPrice(8900.90);
//        System.out.println(hp.getBrand());
//        System.out.println(hp.getPrice());

        System.out.println(hp);
    }
}
