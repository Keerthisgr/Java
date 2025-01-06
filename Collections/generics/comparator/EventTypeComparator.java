package com.xworkz.collection.generics.comparator;

import com.xworkz.collection.generics.customtype.Event;

import java.util.Comparator;

public class EventTypeComparator implements Comparator<Event> {
    @Override
    public int compare(Event o1, Event o2) {
        return o1.getEventType().compareTo(o2.getEventType());
    }
}
