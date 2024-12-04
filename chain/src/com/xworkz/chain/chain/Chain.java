package com.xworkz.chain.chain;


import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Chain {
    private String materialType;
    private String metalType;
    private String gemType;
    private int modelId;

    public Chain() {
        System.out.println("Default constructor!!..");
    }
    @Override
    public String toString(){
        return "Chain (Material Type: "+this.materialType+","+" Metal type: "+this.metalType+","+" Gem type: "+this.gemType+")";
    }
    @Override
    public int hashCode(){
        return modelId;
    }
    @Override
    public boolean equals(Object obj){
        Chain chain = (Chain) obj;
        if(this.hashCode()==chain.hashCode()&&this.materialType==chain.materialType&&this.metalType==chain.metalType&&this.gemType==chain.gemType)
            return true;
        return false;
    }
}

