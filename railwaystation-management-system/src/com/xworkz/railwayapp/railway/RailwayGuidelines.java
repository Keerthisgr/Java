package com.xworkz.railwayapp.railway;

public abstract class RailwayGuidelines implements RailwayStationGuidelines{

    @Override
    public void maintainSilence() {
        System.out.println("Maintain Silence");
    }

    @Override
    public void buyTicket() {
        System.out.println("Buy Ticket");
    }

    @Override
    public void maintainQueueForTicket() {
        System.out.println("Maintain Queue for ticket");
    }

    @Override
    public void mindTheGap() {
        System.out.println("Mind the gap");
    }

    @Override
    public void doNotRun() {
        System.out.println("Do not Run");
    }


    @Override
    public void avoidHanging() {
        System.out.println("Avoid hanging");
    }

    @Override
    public void standBehindSafetyLine() {
        System.out.println("Stand behind safety line");
    }

    @Override
    public void maintainSafety() {
        System.out.println("Maintain safety");
    }

    @Override
    public void respectElderlies() {
        System.out.println("Respect Elderlies");
    }

    @Override
    public void emergencyExit() {
        System.out.println("Emergency exit");
    }
}
