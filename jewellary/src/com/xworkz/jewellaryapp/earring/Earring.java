package com.xworkz.jewellaryapp.earring;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Earring {
    private String materialType;
    private String metalType;
    private String gemType;
    private String countryOfOrigin;
    private int modelId;

    public Earring() {
        System.out.println("Default constructor!!...");
    }
    @Override
    public String toString(){
        return "Earring(Material type: "+this.materialType+","+" Metal type: "+this.metalType+","+" Gem type: "+this.gemType+","+" Country of origin: "+this.countryOfOrigin+")";
    }
    @Override
    public int hashCode(){
        return modelId;
    }

    @Override
    public boolean equals(Object obj){
        Earring earing = (Earring) obj;
        if(this.hashCode()==earing.hashCode()&&this.materialType==earing.materialType&&this.metalType==earing.metalType&&this.gemType==earing.gemType&&this.countryOfOrigin==earing.countryOfOrigin)
            return true;
        return false;

    }
}
