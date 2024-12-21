package com.xworkz.emailapp.email.exception;

public class IdNotFoundException extends Exception{
    public IdNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    public static class SubjectNotFoundException extends Exception{
        public SubjectNotFoundException(String errorMessage) {
            super(errorMessage);
        }
    }

    public static class FromAddressNotFoundException extends Exception{
        public FromAddressNotFoundException(String errorMessage) {
            super(errorMessage);
        }
    }
}
