package com.xworkz.lapapp;

import com.xworkz.lapapp.hp.HpLap;
import com.xworkz.lapapp.laptop.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Laptop lp = new HpLap();
        lp.LaptopDetails("HP",56000.90);
        System.out.println("Main ended");
    }


}
