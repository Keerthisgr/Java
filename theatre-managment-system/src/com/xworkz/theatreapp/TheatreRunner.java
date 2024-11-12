package com.xworkz.theatreapp;

import com.xworkz.theatreapp.pvr.PvR;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreRunner
{
    public static void main(String[] args) {
        System.out.println("Main started!!..");
        Theatre t = new PvR();
        t.TheatreInfo(25,"Ajanta");
        System.out.println("Main ended!!..");
    }
}
