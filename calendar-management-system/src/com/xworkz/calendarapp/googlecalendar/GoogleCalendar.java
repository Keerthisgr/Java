package com.xworkz.calendarapp.googlecalendar;

import com.xworkz.calendarapp.googlecalendar.exception.*;

public interface GoogleCalendar {
    public boolean addEvent(Event event);

    public void getDetails();

    public Event getEventById(int id)throws IdNotFoundException;

    public Event getEventByWho(String who)throws NameNotFoundException;

    public Event getEventVyEventType(EventType eventType)throws EventTypeNotFoundException;

    public Event getEventStartDate(String startDate)throws StartdateNotFoundException;

    public Event getEventEndDate(String endDate)throws EnddateNotFoundException;

    public Event getEventByDescription(String description)throws DescriptionNotFoundException;

    public String getWhoByStartDate(String startDate)throws StartdateNotFoundException;

    public String getDescriptionByEventId(int eventId)throws IdNotFoundException;

    public EventType getEventTypeByEventId(int eventId)throws IdNotFoundException;

    public boolean getAllDayEventByEventType(EventType eventType)throws EventTypeNotFoundException;

    public boolean updateStartDateByWho(String who, String updateStartDate);

    public boolean updateStartDateAndEndDateByWho(String who, String updatedStartDate, String updatedEndDate);

    public boolean deleteEventById(int id);
}

