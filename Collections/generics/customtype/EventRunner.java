package com.xworkz.collection.generics.customtype;

import com.xworkz.collection.generics.comparator.EndDateComparator;
import com.xworkz.collection.generics.comparator.EventNameComparator;
import com.xworkz.collection.generics.comparator.EventTypeComparator;
import com.xworkz.collection.generics.comparator.StartDateComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventRunner {
    public static void main(String[] args) {
        List<Event> event = new ArrayList<>();
        event.add(new Event(3,"one day leave","Holiday","12/12/2024","01/01/2025"));
        event.add(new Event(2,"Trip","Leave","12/12/2024","08/01/2024"));
        event.add(new Event(4,"Not keeping well","Leave","12/12/2024","12/12/2024"));
        Collections.sort(event);
        for (Object obj :event) {
            System.out.println(obj);
        }
        System.out.println("Sort by event name");
        Collections.sort(event, new EventNameComparator());
        for (Object obj :event) {
            System.out.println(obj);
        }
        System.out.println("Sort by event type");
        Collections.sort(event,new EventTypeComparator());
        for (Object obj :event) {
            System.out.println(obj);
        }
        System.out.println("Sort by start date");
        Collections.sort(event,new StartDateComparator());
        for (Object obj :event) {
            System.out.println(obj);
        }
        System.out.println("Sort by end date");
        Collections.sort(event,new EndDateComparator());
        for (Object obj :event) {
            System.out.println(obj);
        }
    }
}
