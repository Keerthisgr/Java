package com.xworkz.lapapp;

import com.xworkz.lapapp.laptop.Laptop;

public class LaptopTester {
    public static void main(String[] args) {
        System.out.println("Main started");
        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setPrice(78900);
        laptop.setVersion("12.8v");
//        System.out.println(laptop.getBrand());
//        System.out.println(laptop.getPrice());
//        System.out.println(laptop.getVersion());
        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Dell");
        laptop1.setPrice(78900);
        laptop1.setVersion("12.8v");
        System.out.println(laptop.hashCode());
        System.out.println(laptop1.hashCode());
        boolean isSame = laptop.equals(laptop1);
        System.out.println(isSame);
        System.out.println("Main ended");
    }
}
