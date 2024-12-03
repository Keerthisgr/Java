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
    public Smart() {
        System.out.println("Default constructor");
    }
    public String toString(){
        return "SmartWatch(Case Diameter: "+this.caseDiameter+","+" Band Color: "+this.bandColor+","+" Item weight: "+this.itemWeight+","+" Country of origin: "+this.countryOfOrigin+")";
    }
}
