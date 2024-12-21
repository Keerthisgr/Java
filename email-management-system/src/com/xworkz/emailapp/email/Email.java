package com.xworkz.emailapp.email;

import com.xworkz.emailapp.email.exception.BodyNotFoundException;
import com.xworkz.emailapp.email.exception.IdNotFoundException;
import com.xworkz.emailapp.email.exception.ToaddressNotFoundException;

public interface Email {
    public boolean saveMail(Gmail compose);
    public void getDetails();
    public boolean getEmailById(String id)throws IdNotFoundException;
    public Gmail getEmailByToAddress(String to)throws ToaddressNotFoundException;
    public Gmail getEmailByFromAddress(String from)throws IdNotFoundException.FromAddressNotFoundException;
    public Gmail getEmailBySubject(String subject)throws IdNotFoundException.SubjectNotFoundException;
    public Gmail getEventByBody(String body)throws BodyNotFoundException;
    public String getToByFrom(String from)throws IdNotFoundException.FromAddressNotFoundException;

}
