package com.xworkz.calendarapp.event;

import com.xworkz.calendarapp.eventtype.EventType;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Event {
    private int eventId;
    private String who;
    private String startDate;
    private String endDate;
    private EventType eventType;
    private String description;
    private boolean allDayEvent;
}
