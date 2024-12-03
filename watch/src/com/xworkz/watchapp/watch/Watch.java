package com.xworkz.watchapp.watch;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Watch {
    private String brand;
    private double price;

    public Watch() {
        System.out.println("Default constructor");
    }
    public String toString(){
        return "Watch(Brand: "+this.brand+","+" Price: "+this.price+")";
    }
}
