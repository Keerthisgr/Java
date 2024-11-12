package com.xworkz.furnitureapp;

import com.xworkz.furnitureapp.furnitureapp.Furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Furniture furn  = new Furniture();
        furn.Info(45000.99);
        System.out.println("Main ended");
    }
}
