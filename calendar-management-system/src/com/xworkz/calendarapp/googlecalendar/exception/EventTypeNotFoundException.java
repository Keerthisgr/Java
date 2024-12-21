package com.xworkz.calendarapp.googlecalendar.exception;

public class EventTypeNotFoundException extends RuntimeException{
    public EventTypeNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
