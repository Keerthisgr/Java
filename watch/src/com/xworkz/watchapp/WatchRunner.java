package com.xworkz.watchapp;

import com.xworkz.watchapp.watch.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch wt = new Watch();
        wt.setBrand("Fastrack");
        wt.setPrice(5600.90);
        wt.setModelId(567);
//        System.out.println(wt.getBrand());
//        System.out.println(wt.getPrice());
        System.out.println(wt);
        Watch wt1 = new Watch();
        wt1.setBrand("Fastrack");
        wt1.setPrice(5600.90);
        wt1.setModelId(567);

        System.out.println(wt.hashCode());
        System.out.println(wt1.hashCode());

        boolean same = wt.equals(wt1);
        System.out.println(same);
    }
}
