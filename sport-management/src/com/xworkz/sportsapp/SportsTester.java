package com.xworkz.sportsapp;

import com.xworkz.sportsapp.cricket.Cricket;
import com.xworkz.sportsapp.sport.Sport;

public class SportsTester {
    public static void main(String[] args) {
        System.out.println("Main started");
        Sport sp = new Cricket();
        sp.Info(11);
        System.out.println("Main ended");
    }
}
