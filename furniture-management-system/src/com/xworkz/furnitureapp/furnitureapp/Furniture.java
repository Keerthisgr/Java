package com.xworkz.furnitureapp.furnitureapp;

public class Furniture {
    private double cost;

    public Furniture() {
        System.out.println("Default constructor is invoked!!..");
    }
    public void Info(double cost){
        this.cost = cost;
        System.out.println("Cost: "+this.cost);
    }



}
