package com.xworkz.theatreapp.theatre;

public class Theatre {
    private int noOfSeats;
    private String name;


    public Theatre() {
        System.out.println("Theatre class constructor is invoked!!");
    }

    public void TheatreInfo(int noOfSeats, String name){
        this.noOfSeats = noOfSeats;
        this.name = name;
        System.out.println("No. of Seats: "+this.noOfSeats);
        System.out.println("Name: "+this.name);
    }


}
