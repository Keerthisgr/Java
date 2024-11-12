package com.xworkz.hotelapp.hotel;

public class Hotel {
    private String type;

    public Hotel() {
        System.out.println("Default constructor of Hotel class is invoked!!");
    }
    public void HotelInfo(String type){
        this.type = type;
        System.out.println("Type of Hotel: "+this.type);
    }
}
