package com.xworkz.calendarapp.googlecalendar;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main started");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of events to be added");
        int size = scanner.nextInt();
        Calendar calendar = new Calendar(size);
//        int start =0;
//        while(start<size){
        for (int start = 0; start < size; start++){
            Event event = new Event();
            System.out.println("Enter an event Id");
            event.setEventId(scanner.nextInt());
            System.out.println("Enter an event type");
            event.setEventType(EventType.valueOf(scanner.next().toUpperCase()));
            System.out.println("Enter description");
            scanner.nextLine();
            event.setDescription(scanner.nextLine());
            System.out.println("Enter start date");
            event.setStartDate(scanner.next());
            System.out.println("Enter end date");
            event.setEndDate(scanner.next());
            System.out.println("Enter who");
            event.setWho(scanner.next());
            System.out.println("Is it all day event");
            event.setAllDayEvent(scanner.nextBoolean());
            calendar.addEvent(event);
//                    start++;
        }
        calendar.getDetails();

        String value = null;
        do{
            System.out.println("Select any one option given below");
            System.out.println("Press 1 to get all the details");
            System.out.println("Press 2 to get an event by id");
            System.out.println("Press 3 to get an event based on who");
            System.out.println("Press 4 to get an event by event type");
            System.out.println("Press 5 to get an event based on providing start date");
            System.out.println("Press 6 to get an event based on end date");
            System.out.println("Press 7 to get an event based on a description");
            System.out.println("Press 8 to get who by providing start date");
            System.out.println("press 9 to get description based on providing an event id");
            System.out.println("Press 10 to get an event type based on an event id");
            System.out.println("Press 11 to get all day event based on an event type");
            System.out.println("Press 12 to update start date based on providing who");
            System.out.println("Press 13 to update start and end date by providing who");
            System.out.println("press 14 to delete an event by providing id");
            System.out.println("Enter your option");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    calendar.getDetails();
                    break;

                case 2:
                    System.out.println("Enter an Id to get an Event");
                    System.out.println(calendar.getEventById(scanner.nextInt()));
                    break;

                case 3:
                    System.out.println("Enter Who and get an Event");
                    System.out.println(calendar.getEventByWho(scanner.next()));
                    break;

                case 4:
                    System.out.println("Enter an Event Type to get an Event");
                    System.out.println(calendar.getEventVyEventType(EventType.valueOf(scanner.next().toUpperCase())));
                    break;

                case 5:
                    System.out.println("Enter a Start Date to get event");
                    System.out.println(calendar.getEventStartDate(scanner.next()));
                    break;

                case 6:
                    System.out.println("Enter an end date to get an Event");
                    System.out.println(calendar.getEventEndDate(scanner.next()));
                    break;

                case 7:
                    System.out.println("Enter a description to get an Event");
                    scanner.nextLine();
                    System.out.println(calendar.getEventByDescription(scanner.nextLine()));
                    break;

                case 8:
                    System.out.println("Enter a start date to get Who");
                    System.out.println(calendar.getWhoByStartDate(scanner.next()));
                    break;

                case 9:
                    System.out.println("Enter an event Id to get Description");
                    System.out.println(calendar.getDescriptionByEventId(scanner.nextInt()));
                    break;

                case 10:
                    System.out.println("Enter an event Id to get EventType");
                    System.out.println(calendar.getEventTypeByEventId(scanner.nextInt()));
                    break;

                case 11:
                    System.out.println("Enter an EventType to get AllDayEvent");
                    System.out.println(calendar.getAllDayEventByEventType(EventType.valueOf(scanner.next().toUpperCase())));
                    break;

                case 12:
                    System.out.println("Enter Who to update StartDate");
                    System.out.println("Enter who");
                    String whose = scanner.next();
                    System.out.println("Enter updated date");
                    String updatedDate = scanner.next();
                    System.out.println(calendar.updateStartDateByWho(whose,updatedDate));
                    break;

                case 13:
                    System.out.println("Enter Who to update StartDate And EndDate");
                    System.out.println("Enter who");
                    String name = scanner.next();
                    System.out.println("Enter start date to be updated");
                    String updatedDate1 = scanner.next();
                    System.out.println("Enter end date to be updated");
                    String updatedEndDate = scanner.next();
                    System.out.println(calendar.updateStartDateAndEndDateByWho(name,updatedDate1,updatedEndDate));
                    break;

                case 14:
                    System.out.println("Enter Id to delete an Event");
                    System.out.println(calendar.deleteEventById(scanner.nextInt()));
                    break;


                default:
                    System.out.println("Please enter valid option");
            }
            System.out.println("Do you want to continue? yes/no");
            value = scanner.next();
        }
        while(value.equalsIgnoreCase("yes"));
        System.out.println("Thak you!");
//        Event event = new Event();
//        event.setEventId(101);
//        event.setWho("Adhya");
//        event.setEventType(EventType.Holiday);
//        event.setDescription("One day leave");
//        event.setStartDate("12/11/24");
//        event.setEndDate("12/11/24");
//        Calendar calendar = new Calendar();
//        calendar.addEvent(event);
////        calendar.getDetails();
//
//        Event eve1 = new Event();
//        eve1.setEventId(103);
//        eve1.setWho("Radha");
//        eve1.setEventType(EventType.Holiday);
//        eve1.setDescription("Friend's marriage");
//        eve1.setAllDayEvent(false);
//        eve1.setStartDate("13/11/24");
//        eve1.setEndDate("13/11/24");
//
//        calendar.addEvent(eve1);
////        calendar.getDetails();
//
//        Event eve2 = new Event();
//        eve2.setEventId(105);
//        eve2.setWho("Raju");
//        eve2.setDescription("Familty trip");
//        eve2.setAllDayEvent(true);
//        eve2.setEventType(EventType.Travel);
//        eve2.setStartDate("17/11/24");
//        eve2.setEndDate("21/11/24");
//
//        calendar.addEvent(eve2);
//        calendar.getDetails();
//
//        calendar.getWhoByStartDate("22/08/24");
//        calendar.getDescriptionByEventId(3);
//        calendar.getAllDayEventByEventType(EventType.Travel);
//        calendar.updateStartDateByWho("Lakshmi","27/11/24");
//        calendar.getWhoByStartDate("27/11/24");
//        calendar.updateStartDateAndEndDateByWho("Akshatha","12/12/24","20/11/24");
//        calendar.getWhoByStartDate("12/12/24");
//        calendar.deleteEventById(1);
//        calendar.getDetails();


        System.out.println("Main ended");
    }
}
