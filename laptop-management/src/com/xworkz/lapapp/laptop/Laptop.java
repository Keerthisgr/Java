package com.xworkz.lapapp.laptop;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Laptop {
    private String brand;
    private int price;
    private String version;

    public Laptop() {
        System.out.println("Default constructor");
    }
    @Override
    public String toString(){
        return "Laptop(Brand: "+this.brand+","+" Price: "+this.price+","+" Version: "+this.version+")";
    }
    @Override
    public int hashCode(){
        return price;
    }
    @Override
    public boolean equals(Object obj){
        Laptop lap = (Laptop) obj;
        if(this.hashCode()==lap.hashCode() && this.version==lap.version && this.brand == lap.brand)
            return true;

        return false;
    }
}
