package com.xworkz.trafficapp.traffic;

public  abstract class TrafficRulesForTwoWheeler implements Traffic{

    @Override
    public void insurance() {
        System.out.println("Insurance method");
    }

    @Override
    public void electronicDevices() {
        System.out.println("Electronic devices");
    }

    @Override
    public void trafficSignals() {
        System.out.println("Traffic Signals");
    }

    @Override
    public void numberPlates() {
        System.out.println("Number plate");
    }

    @Override
    public void drivingLicence() {
        System.out.println("Driving Licence");
    }

    @Override
    public void sideWalks() {
        System.out.println("Side walks");
    }

    @Override
    public void zebraCrossing() {
        System.out.println("Zebra Crossing");
    }

    @Override
    public void safeDistance() {
        System.out.println("Safe Distance");
    }

    @Override
    public void parking() {
        System.out.println("Parking");
    }

    @Override
    public void smoking() {
        System.out.println("Smoking");
    }

    @Override
    public void laneDiscipline() {
        System.out.println("Lane Distance");
    }
}
