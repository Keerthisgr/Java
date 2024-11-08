package com.xworkz.stationapp;

import com.xworkz.stationapp.details.Details;
import com.xworkz.stationapp.metro.Metro;

public class DetailTester {
    public static void main(String[] args) {
        Details det = new Details();
        Metro met = new Metro();
        met.setTrainId(2345);
        met.setTrainName("Namma Metro");
        met.setSourceStation("Rajaji Nagar");
        met.setDestinationStation("Hosahalli");
        met.setLine("Green");
        det.addTrainInfo(met);
        det.getInformation();
    }
}
