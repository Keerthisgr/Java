package com.xworkz.headphoneapp.headphone;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Headphone {
    private String brand;
    private double price;

    public Headphone() {
        System.out.println("Default constructor");
    }
    public String toString(){
        return "Headphones(Brand: "+this.brand+","+" Price: "+this.price+")";
    }
}
