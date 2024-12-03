package com.xworkz.chain.chain;


import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Chain {
    private String materialType;
    private String metalType;
    private String gemType;

    public Chain() {
        System.out.println("Default constructor!!..");
    }
    public String toString(){
        return "Chain (Material Type: "+this.materialType+","+" Metal type: "+this.metalType+","+" Gem type: "+this.gemType+")";
    }
}

