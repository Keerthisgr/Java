package com.xworkz.gmailapp;

import com.xworkz.gmailapp.gmail.Gmail;
import com.xworkz.gmailapp.mail.Mail;

public class GmailRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Gmail gmail = new Gmail();
        gmail.setTo("keerthi@gmail.com");
        gmail.setFrom("Akshata@gmail.com");
        gmail.setSubject("Requesting for a leave");
        gmail.setBody("From 12/11/24 to 13/11/24");
        gmail.setDocAttached(true);
        Mail mail = new Mail();
        mail.saveMail(gmail);
        mail.getDetails();

//        mail.getDetails();

        Gmail gmail1 = new Gmail();
        gmail1.setTo("karthik@gmail.com");
        gmail1.setFrom("Arun@gmail.com");
        gmail1.setSubject("Attend meeting");
        gmail1.setBody("On 22/11/24 at 12:00");
        gmail1.setDocAttached(true);

        mail.saveMail(gmail1);

        Gmail gmail2 = new Gmail();
        gmail2.setTo("kavya@gmail.com");
        gmail2.setFrom("Abhinav@gmail.com");
        gmail2.setSubject("To check issued ticket");
        gmail2.setBody("Do all these work before 21/11/24");
        gmail2.setDocAttached(false);

        mail.saveMail(gmail2);

        Gmail gmail3 = new Gmail();
        gmail3.setTo("chethan@gmail.com");
        gmail3.setFrom("lavanya@gmail.com");
        gmail3.setSubject("Birthday wishes");
        gmail3.setBody("Happy Birthday");
        gmail3.setDocAttached(true);

        mail.saveMail(gmail3);

        Gmail gmail4 = new Gmail();
        gmail4.setTo("vandana@gmail.com");
        gmail4.setFrom("bhagya@gmail.com");
        gmail4.setSubject("Planning for a science exhibition");
        gmail4.setBody("To explore more things we can do this");
        gmail4.setDocAttached(true);

        mail.saveMail(gmail4);
//        mail.getDetails();
        mail.getEmailById("karthik@gmail.com");
        mail.getEmailByToAddress("keerthi@gmail.com");
        mail.getEmailByFromAddress("lavanya@gmail.com");
        mail.getEmailBySubject("Birthday wishes");
        mail.getEventByBody("Birthday");
        System.out.println("Main ended");


    }
}
