package com.xworkz.calendarapp.googlecalendar;

import java.util.Arrays;

public class Calendar implements GoogleCalendar{
    Event events[] = new Event[3];
    int index;
    @Override
    public boolean addEvent(Event event) {
        boolean isAdded = false;
        if (index < this.events.length) {
            this.events[index++] = event;
            isAdded = true;

        } else {
            System.out.println("Maximum length is reached!!...");
        }
        return isAdded;
    }

    @Override
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

    @Override
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
        if (eventToBeReturned == null)
            System.out.println("Event id not found " + id);
        return eventToBeReturned;
    }

    @Override
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
        if (eventToBeReturnByName == null)
            System.out.println("Not found");
        return eventToBeReturnByName;
    }

    @Override
    public Event getEventVyEventType(EventType eventType) {
        Event eventToBeReturned = null;
        for (Event event : events) {
            if (event.getEventType() == eventType) {
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
        if (eventToBeReturned == null)
            System.out.println("Not found");
        return eventToBeReturned;
    }

    @Override
    public Event getEventStartDate(String startDate) {
        Event eventToBeRuturnedByStartDate = null;
        for (Event ever : events) {
            if (ever.getStartDate() == startDate) {
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
        if (eventToBeRuturnedByStartDate == null)
            System.out.println("Event not found on that date: " + startDate);
        return eventToBeRuturnedByStartDate;
    }

    @Override
    public Event getEventEndDate(String endDate) {
        Event eventToBeRuturnedByEndDate = null;
        for (Event eve : events) {
            if (eve.getEndDate() == endDate) {
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
        if (eventToBeRuturnedByEndDate == null)
            System.out.println("Event not found on that date: " + endDate);
        return eventToBeRuturnedByEndDate;
    }

    @Override
    public Event getEventByDescription(String description) {
        Event eventToBeRuturnedByDescription = null;
        for (Event even : events) {
            if (even.getDescription() == description) {
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
        if (eventToBeRuturnedByDescription == null)
            System.out.println("Event not found on that description: " + description);
        return eventToBeRuturnedByDescription;
    }

    @Override
    public String getWhoByStartDate(String startDate) {
        String when = null;
        for (Event ref3 : events) {
            if (ref3.getStartDate() == startDate) {
                when = ref3.getWho();
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Who: " + ref3.getWho());

            }
        }
        if(when==null)
            System.out.println("Not found");
        return when;
    }

    @Override
    public String getDescriptionByEventId(int eventID) {
        String descriptionById = null;
        for(Event reference : events){
            if(reference.getEventId()==eventID){
                descriptionById=reference.getDescription();
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Description: "+descriptionById);
            }
        }
        if(descriptionById==null)
            System.out.println("Description not found!!");
        return descriptionById;
    }

    @Override
    public EventType getEventTypeByEventId(int eventId) {
        EventType eventType1 = null;
        for(Event refer:events){
            if(refer.getEventId()==eventId){
                eventType1=refer.getEventType();
            }
        }
        return eventType1;
    }

    @Override
    public boolean getAllDayEventByEventType(EventType eventType) {
        boolean isAllDayEvent = false;
        for(Event refere:events){
            if(refere.getEventType()==eventType){
                isAllDayEvent=refere.isAllDayEvent();

            }
        }return isAllDayEvent;
    }

    @Override
    public boolean updateStartDateByWho(String who, String updateStartDate) {
        boolean isUpdated = false;
        for(Event refe:events){
            if(refe.getWho()==who){
                refe.setStartDate(updateStartDate);
                isUpdated = true;
            }
        }
        if(isUpdated==false)
            System.out.println("Not found");
        return isUpdated;
    }

    @Override
    public boolean updateStartDateAndEndDateByWho(String who, String updatedStartDate, String updatedEndDate) {
        boolean isDatesUpdated = false;
        for(Event refere1 : events){
            if(refere1.getWho()==who){
                refere1.setStartDate(updatedStartDate);
                refere1.setEndDate(updatedEndDate);
                isDatesUpdated=true;

            }
        }
        if(isDatesUpdated==false)
            System.out.println("Person not exists to update the dates");
        return  isDatesUpdated;
    }

    @Override
    public boolean deleteEventById(int id) {
        boolean isEventDeleted = false;
        int i=0;
        for(int start=0; start<this.events.length;start++)
        {
            if(events[start].getEventId()!=id){
                events[i++]=events[start];
            }
            else{
                isEventDeleted = true;
            }
        }int size = i;
        events = Arrays.copyOf(events,i);
        return isEventDeleted;
    }
}
