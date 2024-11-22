package com.xworkz.calendarapp;

import com.xworkz.calendarapp.calendar.Calendar;
import com.xworkz.calendarapp.event.Event;
import com.xworkz.calendarapp.eventtype.EventType;

public class EventRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Event event = new Event();
        event.setEventId(101);
        event.setWho("Adhya");
        event.setEventType(EventType.Holiday);
        event.setDescription("One day leave");
        event.setStartDate("12/11/24");
        event.setEndDate("12/11/24");
        Calendar calendar = new Calendar();
        calendar.addEvent(event);
        calendar.getDetails();

        Event eve1 = new Event();
        eve1.setEventId(103);
        eve1.setWho("Radha");
        eve1.setEventType(EventType.Holiday);
        eve1.setDescription("Friend's marriage");
        eve1.setAllDayEvent(true);
        eve1.setStartDate("13/11/24");
        eve1.setEndDate("13/11/24");


        calendar.addEvent(eve1);
//        calendar.getDetails();

        Event eve2 = new Event();
        eve2.setEventId(105);
        eve2.setWho("Raju");
        eve2.setDescription("Familty trip");
        eve2.setAllDayEvent(true);
        eve2.setEventType(EventType.Travel);
        eve2.setStartDate("17/11/24");
        eve2.setEndDate("21/11/24");

        calendar.addEvent(eve2);
//        calendar.getDetails();

        Event eve3 = new Event();
        eve3.setEventId(106);
        eve3.setWho("Anjali");
        eve3.setDescription("Family trip");
        eve3.setAllDayEvent(true);
        eve3.setEventType(EventType.Travel);
        eve3.setStartDate("21/11/24");
        eve3.setEndDate("26/11/24");


        calendar.addEvent(eve3);
//        calendar.getDetails();

        Event eve4 = new Event();
        eve4.setEventId(108);
        eve4.setWho("Hamsa");
        eve4.setDescription("Last working day");
        eve4.setAllDayEvent(true);
        eve4.setEventType(EventType.LWD);
        eve4.setStartDate("17/11/24");
        eve4.setEndDate("21/11/24");


        calendar.addEvent(eve4);
//        calendar.getDetails();

        Event eve5 = new Event();
        eve5.setEventId(109);
        eve5.setWho("Kavana");
        eve5.setDescription("Mother's birthday celebration");
        eve5.setAllDayEvent(true);
        eve5.setEventType(EventType.Birthday);
        eve5.setStartDate("19/11/24");
        eve5.setEndDate("19/11/24");

        calendar.addEvent(eve5);
//        calendar.getDetails();

        Event eve6 = new Event();
        eve6.setEventId(201);
        eve6.setWho("Kavya");
        eve6.setDescription("One day trip");
        eve6.setAllDayEvent(true);
        eve6.setEventType(EventType.Travel);
        eve6.setStartDate("21/11/24");
        eve6.setEndDate("21/11/24");

        calendar.addEvent(eve6);
//        calendar.getDetails();

        Event eve7 = new Event();
        eve7.setEventId(203);
        eve7.setWho("Kaveri");
        eve7.setDescription("One day leave");
        eve7.setAllDayEvent(true);
        eve7.setEventType(EventType.Leave);
        eve7.setStartDate("20/11/24");
        eve7.setEndDate("20/11/24");


        calendar.addEvent(eve7);
//        calendar.getDetails();

        Event eve8 = new Event();
        eve8.setEventId(205);
        eve8.setWho("Lakshmi");
        eve8.setDescription("Familty trip");
        eve8.setAllDayEvent(true);
        eve8.setEventType(EventType.Travel);
        eve8.setStartDate("22/11/24");
        eve8.setEndDate("24/11/24");


        calendar.addEvent(eve8);
//        calendar.getDetails();

        Event eve9 = new Event();
        eve9.setEventId(206);
        eve9.setWho("Akshatha");
        eve9.setDescription("Fever");
        eve9.setAllDayEvent(true);
        eve9.setEventType(EventType.Hospital);
        eve9.setStartDate("22/11/24");
        eve9.setEndDate("22/11/24");


        calendar.addEvent(eve9);
//        calendar.getDetails();

        Event eve10 = new Event();
        eve10.setEventId(215);
        eve10.setWho("Apoorva");
        eve10.setDescription("Family trip");
        eve10.setAllDayEvent(true);
        eve10.setEventType(EventType.Travel);
        eve10.setStartDate("20/11/24");
        eve10.setEndDate("25/11/24");


        calendar.addEvent(eve10);
        calendar.getDetails();
        calendar.getEventById(205);
        calendar.getEventById(1);
        calendar.getEventByWho("Akshatha");
        calendar.getEventByWho("Aradana");
        calendar.getEventVyEventType(EventType.Travel);
        calendar.getEventByDescription("Last working day");
        calendar.getEventEndDate("05/11/24");
        calendar.getEventStartDate("11/11/24");


        System.out.println("Main ended");

    }
}
