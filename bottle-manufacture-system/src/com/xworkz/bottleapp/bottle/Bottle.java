package com.xworkz.bottleapp.bottle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bottle {
    private String brand;
    private String material;
    private String bottleType;
    private String color;
    private String capacity;

    public Bottle() {
        System.out.println("Default constructor of Bottle class is invoked!!..");
    }


    public String toString() {
    return "Bottle(Brand: "+this.brand+","+" Material: "+this.material+","+" Bottle Type: "+this.bottleType+","+" Color: "+this.color+","+" Capacity: "+this.capacity+")";
    }
}

