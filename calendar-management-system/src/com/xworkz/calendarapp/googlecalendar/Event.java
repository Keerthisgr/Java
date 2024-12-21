package com.xworkz.calendarapp.googlecalendar;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Event {
    private int eventId;
    private String who;
    private String startDate;
    private String endDate;
    private EventType eventType;
    private String description;
    private boolean allDayEvent;
}
