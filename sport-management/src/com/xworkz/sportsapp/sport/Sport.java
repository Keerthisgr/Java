package com.xworkz.sportsapp.sport;

public class Sport{
    private int players;

    public Sport() {
        System.out.println("Sport default constructor is invoked");
    }
    public void Info(int players){
        this.players = players;
        System.out.println("Number of players: "+this.players);
    }
}
