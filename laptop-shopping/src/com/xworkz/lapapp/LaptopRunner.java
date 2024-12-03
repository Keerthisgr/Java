package com.xworkz.lapapp;

import com.xworkz.lapapp.laptop.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setPrice("78.900");
        laptop.setVersion("12.8v");
//        System.out.println(laptop.getBrand());
//        System.out.println(laptop.getPrice());
//        System.out.println(laptop.getVersion());

        System.out.println(laptop);
}
}