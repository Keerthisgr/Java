package com.xworkz.hotelapp;

import com.xworkz.hotelapp.hotel.Hotel;
import com.xworkz.hotelapp.radisson.Radisson;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Hotel h = new Hotel();
        h.HotelInfo("Veg");

        System.out.println("Main Ended");
    }
}
