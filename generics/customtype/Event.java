package com.xworkz.collection.generics.customtype;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Event {
    private int eventId;
    private String eventName;
    private String eventType;
    private String startDate;
    private String endDate;

}
