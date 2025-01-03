package com.xworkz.collection.generics.customtype;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Event implements Comparable<Event> {
    private int eventId;
    private String eventName;
    private String eventType;
    private String startDate;
    private String endDate;

    @Override
    public int compareTo(Event o) {
        return this.getEventId() - o.getEventId();
    }
}
