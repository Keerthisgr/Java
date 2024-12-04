package com.xworkz.headphoneapp.headphone;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Headphone {
    private String brand;
    private int price;

    public Headphone() {
        System.out.println("Default constructor");
    }
    public String toString(){
        return "Headphones(Brand: "+this.brand+","+" Price: "+this.price+")";
    }
    public boolean equals(Object obj){
        Headphone headphone = (Headphone) obj;
        if(this.hashCode() == headphone.hashCode() && this.brand == headphone.brand)//equality contract
            return true;
        return false;
    }
    @Override
    public int hashCode(){
        return price;
    }
}
//String methods