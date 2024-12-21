package com.xworkz.calendarapp.googlecalendar.exception;

public class StartdateNotFoundException extends RuntimeException{
    public StartdateNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
