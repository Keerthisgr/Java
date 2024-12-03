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

    public Earring() {
        System.out.println("Default constructor!!...");
    }
    public String toString(){
        return "Earring(Material type: "+this.materialType+","+" Metal type: "+this.metalType+","+" Gem type: "+this.gemType+","+" Country of origin: "+this.countryOfOrigin+")";
    }
}
