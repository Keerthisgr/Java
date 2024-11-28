package com.xworkz.railwayapp.railway;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main started");
        RailwayStationGuidelines railwayGuidelines = new RailwayStationGuidelinesSub();
        railwayGuidelines.avoidHanging();
        railwayGuidelines.buyTicket();
        railwayGuidelines.maintainQueueForTicket();
        railwayGuidelines.maintainSafety();
        railwayGuidelines.maintainSilence();
        railwayGuidelines.mindTheGap();
        railwayGuidelines.maintainCleanliness();
        railwayGuidelines.respectPrioritySeats();
        railwayGuidelines.secureYourBelongings();
        railwayGuidelines.standBehindSafetyLine();
        System.out.println("Main ended");
    }
}

