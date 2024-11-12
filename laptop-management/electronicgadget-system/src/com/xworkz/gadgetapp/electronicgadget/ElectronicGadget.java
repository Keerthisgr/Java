package com.xworkz.gadgetapp.electronicgadget;

public class ElectronicGadget {
    private double cost;

    public ElectronicGadget() {
        System.out.println("Default constructor of an electronic gadget class");
    }
    public void getInfo(double cost){
        this.cost = cost;
        System.out.println("Cost is: "+this.cost);
    }
}
