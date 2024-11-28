package com.xworkz.emailapp.email;

public interface Email {
    public boolean saveMail(Gmail compose);
    public void getDetails();
    public void getEmailById(String id);
    public Gmail getEmailByToAddress(String to);
    public Gmail getEmailByFromAddress(String from);
    public Gmail getEmailBySubject(String subject);
    public Gmail getEventByBody(String body);
    public String getToByFrom(String from);

}
