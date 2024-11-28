package com.xworkz.trafficapp.traffic;

public class TwoWheelerSubClass extends TrafficRulesForTwoWheeler{
    @Override
    public void seatBelt() {
        System.out.println("Seat belt");
    }

    @Override
    public void drinkAndDrive() {
        System.out.println("Drink and Drive");
    }

    @Override
    public void wearingHelmet() {
        System.out.println("Wearing Helmet");
    }

    @Override
    public void speedLimits() {
        System.out.println("Speed Limits");
    }
}
