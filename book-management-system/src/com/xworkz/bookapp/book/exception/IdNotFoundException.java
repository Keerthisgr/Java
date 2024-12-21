package com.xworkz.bookapp.book.exception;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
