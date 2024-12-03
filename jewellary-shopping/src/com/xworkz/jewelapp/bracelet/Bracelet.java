package com.xworkz.jewelapp.bracelet;

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

    public Bracelet() {
        System.out.println("Default constructor");
    }
    public String toString(){
        return "Bracelet(Material Type: "+this.materialType+","+" Metal type: "+this.metalType+","+" Size"+this.size+","+" Gem type: "+this.gemType+","+" Country of origin: "+this.countryOfOrigin+")";
    }
}
