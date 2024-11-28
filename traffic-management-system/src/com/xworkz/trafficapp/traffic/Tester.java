package com.xworkz.trafficapp.traffic;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Main started");
        Traffic tra = new TwoWheelerSubClass();
        tra.drinkAndDrive();
        tra.drivingLicence();
        tra.electronicDevices();
        tra.laneDiscipline();
        tra.numberPlates();
        tra.parking();
        tra.insurance();
        System.out.println("Main ended");
    }
}
