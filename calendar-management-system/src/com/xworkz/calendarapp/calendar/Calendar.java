package com.xworkz.calendarapp.calendar;

import com.xworkz.calendarapp.event.Event;
import com.xworkz.calendarapp.eventtype.EventType;

public class Calendar {
Event events[] = new Event[10];
int index;

public boolean addEvent(Event event){
    boolean isAdded = false;
    if(index < this.events.length){
        this.events[index++]=event;
        isAdded=true;

    }else{
        System.out.println("Maximum length is reached!!...");
    }
    return isAdded;
}
public void getDetails() {
    for (Event ever : events) {
        if (ever != null) {
            System.out.println("Event Id: " + ever.getEventId());
            System.out.println("Who: " + ever.getWho());
            System.out.println("Event type: " + ever.getEventType());
            System.out.println("Description: " + ever.getDescription());
            System.out.println("Is all day event: " + ever.isAllDayEvent());
            System.out.println("Event start date: " + ever.getStartDate());
            System.out.println("Event end date: " + ever.getEndDate());
            System.out.println("******************************************");
        }
    }
}
//public Event getEventById(int id) {
//    boolean isIdFound = false;
//    for (Event eId : events) {
//        if (eId != null && eId.getEventId() == id) {
//            System.out.println("Event Id: " + eId.getEventId());
//            System.out.println("Event by Who: " + eId.getWho());
//            System.out.println("Event Start date: " + eId.getStartDate());
//            System.out.println("Event Start date: " + eId.getEndDate());
//            System.out.println("Event Type: " + eId.getEventType());
//            System.out.println("Event Description: " + eId.getDescription());
//            System.out.println("All Day Event: " + eId.isAllDayEvent());
//            isIdFound = true;
//            break;
//        }
//    }
//    if (!isIdFound) System.out.println("No event found with ID: " + id);
//}
public Event getEventById(int id) {
    Event eventToBeReturned = null;
    System.out.println("Event by id method is invoked");
    for (Event eventt : events) {
        if (eventt.getEventId() == id) {
            eventToBeReturned = eventt;
            System.out.println("Event Id: " + eventt.getEventId());
            System.out.println("Event by Who: " + eventt.getWho());
            System.out.println("Event Start date: " + eventt.getStartDate());
            System.out.println("Event Start date: " + eventt.getEndDate());
            System.out.println("Event Type: " + eventt.getEventType());
            System.out.println("Event Description: " + eventt.getDescription());
            System.out.println("All Day Event: " + eventt.isAllDayEvent());
        }
    }
    if(eventToBeReturned==null)
        System.out.println("Event id not found "+id);
    return eventToBeReturned;
}
public Event getEventByWho(String who) {
    Event eventToBeReturnByName = null;
    System.out.println("Event by name is invoked");
    for (Event eve : events) {
        if (eve.getWho() == who) {
            eventToBeReturnByName = eve;
            System.out.println("Event Id: " + eve.getEventId());
            System.out.println("Event by Who: " + eve.getWho());
            System.out.println("Event Start date: " + eve.getStartDate());
            System.out.println("Event Start date: " + eve.getEndDate());
            System.out.println("Event Type: " + eve.getEventType());
            System.out.println("Event Description: " + eve.getDescription());
            System.out.println("All Day Event: " + eve.isAllDayEvent());
            break;
        }
    }
    if(eventToBeReturnByName == null)
        System.out.println("Not found");
    return eventToBeReturnByName;
}
public Event getEventVyEventType(EventType eventType){
    Event eventToBeReturned = null;
    for(Event event:events){
        if(event.getEventType() == eventType){
            eventToBeReturned = event;
            System.out.println("Event Id: " + event.getEventId());
            System.out.println("Event by Who: " + event.getWho());
            System.out.println("Event Start date: " + event.getStartDate());
            System.out.println("Event Start date: " + event.getEndDate());
            System.out.println("Event Type: " + event.getEventType());
            System.out.println("Event Description: " + event.getDescription());
            System.out.println("All Day Event: " + event.isAllDayEvent());
            break;
        }

    }
    if(eventToBeReturned==null)
        System.out.println("Not found");
    return eventToBeReturned;
}
public Event getEventStartDate(String startDate){
    Event eventToBeRuturnedByStartDate = null;
    for(Event ever:events){
        if(ever.getStartDate() == startDate){
            eventToBeRuturnedByStartDate = ever;
            System.out.println("Event Id: " + ever.getEventId());
            System.out.println("Event by Who: " + ever.getWho());
            System.out.println("Event Start date: " + ever.getStartDate());
            System.out.println("Event Start date: " + ever.getEndDate());
            System.out.println("Event Type: " + ever.getEventType());
            System.out.println("Event Description: " + ever.getDescription());
            System.out.println("All Day Event: " + ever.isAllDayEvent());
            break;
        }
    }
    if(eventToBeRuturnedByStartDate==null)
        System.out.println("Event not found on that date: "+startDate);
    return eventToBeRuturnedByStartDate;
}
    public Event getEventEndDate(String endDate){
        Event eventToBeRuturnedByEndDate = null;
        for(Event eve:events){
            if(eve.getEndDate() == endDate){
                eventToBeRuturnedByEndDate = eve;
                System.out.println("Event Id: " + eve.getEventId());
                System.out.println("Event by Who: " + eve.getWho());
                System.out.println("Event Start date: " + eve.getStartDate());
                System.out.println("Event Start date: " + eve.getEndDate());
                System.out.println("Event Type: " + eve.getEventType());
                System.out.println("Event Description: " + eve.getDescription());
                System.out.println("All Day Event: " + eve.isAllDayEvent());
                break;
            }
        }
        if(eventToBeRuturnedByEndDate==null)
            System.out.println("Event not found on that date: "+endDate);
        return eventToBeRuturnedByEndDate;
    }
    public Event getEventByDescription(String description){
        Event eventToBeRuturnedByDescription = null;
        for(Event even:events){
            if(even.getDescription() == description){
                eventToBeRuturnedByDescription = even;
                System.out.println("Event Id: " + even.getEventId());
                System.out.println("Event by Who: " + even.getWho());
                System.out.println("Event Start date: " + even.getStartDate());
                System.out.println("Event Start date: " + even.getEndDate());
                System.out.println("Event Type: " + even.getEventType());
                System.out.println("Event Description: " + even.getDescription());
                System.out.println("All Day Event: " + even.isAllDayEvent());
                break;
            }
        }
        if(eventToBeRuturnedByDescription==null)
            System.out.println("Event not found on that description: "+description);
        return eventToBeRuturnedByDescription;
    }

    }



