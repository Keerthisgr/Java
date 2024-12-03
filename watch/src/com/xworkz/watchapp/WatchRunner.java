package com.xworkz.watchapp;

import com.xworkz.watchapp.watch.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch wt = new Watch();
        wt.setBrand("Fastrack");
        wt.setPrice(5600.90);
//        System.out.println(wt.getBrand());
//        System.out.println(wt.getPrice());
        System.out.println(wt);
    }
}
