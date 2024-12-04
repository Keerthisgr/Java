package com.xworkz.watchapp.watch;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Watch {
    private String brand;
    private double price;
    private int modelId;

    public Watch() {
        System.out.println("Default constructor");
    }
    @Override
    public String toString(){
        return "Watch(Brand: "+this.brand+","+" Price: "+this.price+")";
    }
    @Override
    public int hashCode(){
        return modelId;
    }
    @Override
    public boolean equals(Object obj){
        Watch wat = (Watch) obj;
        if(this.hashCode()==wat.hashCode()&&this.brand==wat.brand&&this.price==wat.price)
            return true;
        return false;
    }
}
