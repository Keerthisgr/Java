package com.xworkz.smartwatchapp.smart;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Smart {
    private String caseDiameter;
    private String bandColor;
    private String itemWeight;
    private String countryOfOrigin;
    private int modelId;
    public Smart() {
        System.out.println("Default constructor");
    }
    @Override
    public String toString(){
        return "SmartWatch(Case Diameter: "+this.caseDiameter+","+" Band Color: "+this.bandColor+","+" Item weight: "+this.itemWeight+","+" Country of origin: "+this.countryOfOrigin+")";
    }
    @Override
    public int hashCode(){
        return modelId;
    }
    @Override
    public boolean equals(Object obj){
        Smart sma = (Smart) obj;
        if(this.hashCode()==sma.hashCode()&&this.caseDiameter==sma.caseDiameter&&this.bandColor==sma.bandColor&&this.itemWeight==sma.itemWeight&&this.countryOfOrigin==sma.countryOfOrigin)
            return true;
        return false;
    }
}
