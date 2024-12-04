package com.xworkz.jewapp.jewellary;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Bracelet {
    private String materialType;
    private String metalType;
    private String size;
    private String gemType;
    private String countryOfOrigin;
    private int modelId;

    public Bracelet() {
        System.out.println("Default constructor");
    }
    @Override
    public String toString(){
        return "Bracelet(Material Type: "+this.materialType+","+" Metal type: "+this.metalType+","+" Size"+this.size+","+" Gem type: "+this.gemType+","+" Country of origin: "+this.countryOfOrigin+")";
    }
    @Override
    public int hashCode(){
        return modelId;
    }
    @Override
    public boolean equals(Object obj){
        Bracelet bracelet = (Bracelet) obj;
        if(this.hashCode()==bracelet.hashCode()&&this.materialType==bracelet.materialType&&this.metalType==bracelet.metalType&&this.size==bracelet.size&&this.gemType==bracelet.gemType&&this.countryOfOrigin==bracelet.countryOfOrigin)
        return true;
        return false;
    }
}
