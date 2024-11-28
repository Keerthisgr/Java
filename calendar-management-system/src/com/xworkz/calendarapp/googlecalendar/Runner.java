package com.xworkz.calendarapp.googlecalendar;

public class Runner {
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
//        calendar.getDetails();

        Event eve1 = new Event();
        eve1.setEventId(103);
        eve1.setWho("Radha");
        eve1.setEventType(EventType.Holiday);
        eve1.setDescription("Friend's marriage");
        eve1.setAllDayEvent(false);
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
        calendar.getDetails();

        calendar.getWhoByStartDate("22/08/24");
        calendar.getDescriptionByEventId(3);
        calendar.getAllDayEventByEventType(EventType.Travel);
        calendar.updateStartDateByWho("Lakshmi","27/11/24");
        calendar.getWhoByStartDate("27/11/24");
        calendar.updateStartDateAndEndDateByWho("Akshatha","12/12/24","20/11/24");
        calendar.getWhoByStartDate("12/12/24");
        calendar.deleteEventById(1);
        calendar.getDetails();

        System.out.println("Main ended");
    }
}
