package com.xworkz.calendarapp.googlecalendar;

public interface GoogleCalendar {
    public boolean addEvent(Event event);

    public void getDetails();

    public Event getEventById(int id);

    public Event getEventByWho(String who);

    public Event getEventVyEventType(EventType eventType);

    public Event getEventStartDate(String startDate);

    public Event getEventEndDate(String endDate);

    public Event getEventByDescription(String description);

    public String getWhoByStartDate(String startDate);

    public String getDescriptionByEventId(int eventID);

    public EventType getEventTypeByEventId(int eventId);

    public boolean getAllDayEventByEventType(EventType eventType);

    public boolean updateStartDateByWho(String who, String updateStartDate);

    public boolean updateStartDateAndEndDateByWho(String who, String updatedStartDate, String updatedEndDate);

    public boolean deleteEventById(int id);
}

