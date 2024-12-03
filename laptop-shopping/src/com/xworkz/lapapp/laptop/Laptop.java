package com.xworkz.lapapp.laptop;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Laptop {
    private String brand;
    private String price;
    private String version;

    public Laptop() {
        System.out.println("Default constructor");
    }
    public String toString(){
        return "Laptop(Brand: "+this.brand+","+" Price: "+this.price+","+" Version: "+this.version+")";
    }
}
