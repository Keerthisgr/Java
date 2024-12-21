package com.xworkz.emailapp.email;

import com.sun.prism.impl.FactoryResetException;
import com.xworkz.emailapp.email.exception.BodyNotFoundException;
import com.xworkz.emailapp.email.exception.IdNotFoundException;
import com.xworkz.emailapp.email.exception.ToaddressNotFoundException;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Main started");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of details to be added");
        int size = scanner.nextInt();
        Mail mail = new Mail(size);
        for(int i = 0; i<size;i++){
            Gmail gmail = new Gmail();
            System.out.println("Enter the to address in correct format");
            gmail.setTo(scanner.next());
            System.out.println("Enter the from address in correct format");
            gmail.setFrom(scanner.next());
            System.out.println("Enter the subject");
            gmail.setSubject(scanner.next());
            System.out.println("Enter the body to an email");
            scanner.nextLine();
            gmail.setBody(scanner.nextLine());
            System.out.println("Enter is document attached");
            gmail.setDocAttached(scanner.nextBoolean());
            mail.saveMail(gmail);
        }

        String value = null;
        do{
            System.out.println("Select any option here: ");
            System.out.println("Press 1 to get all the details");
            System.out.println("Press 2 to get Email Based Id");
            System.out.println("Press 3 to get Email Based on To Address");
            System.out.println("Press 4 to get Email Based on From Address");
            System.out.println("Press 5 to get Email Based on Subject");
            System.out.println("Press 6 to get Event Based on Body of an email");
            System.out.println("Press 7 to get To Based From");
            System.out.println("Enter your option");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    mail.getDetails();
                    break;

                case 2:
                    try {
                        System.out.println("Enter id to get email");
                        System.out.println(mail.getEmailById(scanner.next()));
                    }catch (IdNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Enter to address to get email");
                        System.out.println(mail.getEmailByToAddress(scanner.next()));
                    }catch (ToaddressNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Enter from address to get email");
                        System.out.println(mail.getEmailByFromAddress(scanner.next()));
                    }
                    catch (IdNotFoundException.FromAddressNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    try {
                        System.out.println("Enter subject to get email");
                        System.out.println(mail.getEmailBySubject(scanner.next()));
                    }
                    catch (IdNotFoundException.SubjectNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 6:
                    try {
                        System.out.println("Enter body to get email");
                        System.out.println(mail.getEventByBody(scanner.next()));
                    }
                    catch (BodyNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 7:
                    try {
                        System.out.println("Enter from address to get to address");
                        System.out.println(mail.getToByFrom(scanner.next()));
                    }
                    catch (IdNotFoundException.FromAddressNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                default:
                    System.out.println("Invalid option!!...");
            }
            System.out.println("Do you want to continue? yes/no");
            value = scanner.next();
        }
        while(value.equalsIgnoreCase("yes"));
        System.out.println("Thak you!");

//        Gmail gmail = new Gmail();
//        gmail.setTo("keerthi@gmail.com");
//        gmail.setFrom("Akshata@gmail.com");
//        gmail.setSubject("Requesting for a leave");
//        gmail.setBody("From 12/11/24 to 13/11/24");
//        gmail.setDocAttached(true);
//        Mail mail = new Mail();
//        mail.saveMail(gmail);
////        mail.getDetails();
//
//        Gmail gmail1 = new Gmail();
//        gmail1.setTo("karthik@gmail.com");
//        gmail1.setFrom("Arun@gmail.com");
//        gmail1.setSubject("Attend meeting");
//        gmail1.setBody("On 22/11/24 at 12:00");
//        gmail1.setDocAttached(true);
//
//        mail.saveMail(gmail1);
//
//        Gmail gmail2 = new Gmail();
//        gmail2.setTo("kavya@gmail.com");
//        gmail2.setFrom("Abhinav@gmail.com");
//        gmail2.setSubject("To check issued ticket");
//        gmail2.setBody("Do all these work before 21/11/24");
//        gmail2.setDocAttached(false);
//
//        mail.saveMail(gmail2);
//        mail.getDetails();
//
//        mail.getEmailById("karthik@gmail.com");
//        mail.getEmailByToAddress("keerthi@gmail.com");
//        mail.getEmailByFromAddress("lavanya@gmail.com");
//        mail.getEmailBySubject("Birthday wishes");
//        mail.getEventByBody("Birthday");
//        mail.getToByFrom("lavanya@gmail.com");




        System.out.println("Main ended");
    }
}
