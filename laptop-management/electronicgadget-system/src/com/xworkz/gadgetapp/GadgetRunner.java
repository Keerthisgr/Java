package com.xworkz.gadgetapp;

import com.xworkz.gadgetapp.electronicgadget.ElectronicGadget;
import com.xworkz.gadgetapp.headset.HeadSet;

public class GadgetRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        ElectronicGadget eg = new HeadSet();
        eg.getInfo(3400.90);
        System.out.println("Main ended");
    }
}
