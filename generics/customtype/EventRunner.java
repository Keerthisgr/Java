package com.xworkz.collection.generics.customtype;

import java.util.ArrayList;

public class EventRunner {
    public static void main(String[] args) {
        ArrayList<Event> event = new ArrayList<>();
        event.add(new Event(3,"one day leave","Holiday","12/12/2024","01/01/2025"));
        event.add(new Event(2,"Trip","Leave","12/12/2024","08/01/2024"));
        event.add(new Event(4,"Not keeping well","Leave","12/12/2024","12/12/2024"));
        for (Object obj :event) {
            System.out.println(obj);
        }
    }
}
