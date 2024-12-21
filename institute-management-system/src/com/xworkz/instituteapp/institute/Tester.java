package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.institute.exception.DegreeNotFoundException;
import com.xworkz.instituteapp.institute.exception.GenderNotFoundException;
import com.xworkz.instituteapp.institute.exception.IdNotFoundException;
import com.xworkz.instituteapp.institute.exception.NameNotFoundException;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Main started");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of traniee information to be added");
        int size = scanner.nextInt();
        InstituteCentre instituteCentre = new InstituteCentre(size);
        for(int begin=0; begin<size; begin++)
        {
            Training training = new Training();
            System.out.println("Enter id");
            training.setId(scanner.nextInt());
            System.out.println("Enter your name");
            scanner.nextLine();
            training.setName(scanner.nextLine());
            System.out.println("Enter date of birth");
            training.setDoB(scanner.next());
            System.out.println("Enter your phone number");
            training.setPhoneNumber(scanner.nextLong());
            System.out.println("Enter your gender");
            training.setGenderType(GenderType.valueOf(scanner.next().toUpperCase()));
            System.out.println("Enter your email address");
            training.setEmail(scanner.next());
            System.out.println("Enter your degree name or course name");
            training.setDegreeName(scanner.next());
            System.out.println("Enter year of passing");
            training.setYearOfGraduation(scanner.nextInt());
            System.out.println("Are you placed");
            training.setPlaced(scanner.nextBoolean());
            instituteCentre.addTrainee(training);

        }

//        instituteCentre.getDetails();
        String val = null;
        do{
            System.out.println("Select any one option given below");
            System.out.println("Press 1 to get all the details");
            System.out.println("Press 2 to get trainee name based on their Id");
            System.out.println("Press 3 to get gender of that perticular trainee by providing their Id");
            System.out.println("Press 4 to get trainee name by providing gender");
            System.out.println("Press 5 to get phone number of that perticular trainee by providing their name");
            System.out.println("Press 6 to get email address based on their name");
            System.out.println("Press 7 to get email address based on their id");
            System.out.println("Press 8 to get Date of birth of that trainee based on id");
            System.out.println("Press 9 to get Degree name by providing name");
            System.out.println("Press 10 to get year based on course name");
            System.out.println("Press 11 to updated an email by id");
            System.out.println("Press 12 to updated number based on name");
            System.out.println("Press 13 to updated is placed details");
            System.out.println("Press 14 to delete a trainee details");
            System.out.println("Enter your option");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    instituteCentre.getDetails();
                    break;

                case 2:
                    try {
                        System.out.println("Enter id of a trainee: ");
                        System.out.println(instituteCentre.getNameById(scanner.nextInt()));
                    }catch (IdNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Enter id of a trainee");
                        System.out.println(instituteCentre.getGenderById(scanner.nextInt()));
                    }catch(IdNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Enter gender to get trainee name");
                        System.out.println(instituteCentre.getNameByGender(GenderType.valueOf(scanner.next().toUpperCase())));
                    } catch (GenderNotFoundException s){
                        s.printStackTrace();
                    }
                    break;


                case 5:
                    try {
                        System.out.println("Enter name of the trainee");
                        System.out.println(instituteCentre.getPhoneNumberByName(scanner.next()));
                    }catch (NameNotFoundException n){
                        n.printStackTrace();
                    }
                    break;

                case 6:
                    try {
                        System.out.println("Enter trainee name whose email address you want");
                        System.out.println(instituteCentre.getEmailByName(scanner.next()));
                    }catch(NameNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 7:
                    try {
                        System.out.println("Enter trainee id whose email address you want");
                        System.out.println(instituteCentre.getEmailById(scanner.nextInt()));
                    }catch (IdNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 8:
                    try {
                        System.out.println("Enter trainee id to get DOB");
                        System.out.println(instituteCentre.getDOBById(scanner.nextInt()));
                    }catch (IdNotFoundException e){
                        e.printStackTrace();
                    }
                    
                    break;

                case 9:
                    try {
                        System.out.println("Enter trainee name to know about their course");
                        System.out.println(instituteCentre.getDegreeNameByName(scanner.next()));
                    }catch (NameNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                case 10:
                    try {
                        System.out.println("Enter course name to fetch year");
                        System.out.println(instituteCentre.getYearByDegree(scanner.next()));
                    }catch(DegreeNotFoundException d){
                       d.printStackTrace();
                    }
                    break;

                case 11:
                    System.out.println("Enter id whose email you want to update");
                    int id = scanner.nextInt();
                    System.out.println("Enter udated email id");
                    String updatedEmail = scanner.next();
                    System.out.println(instituteCentre.updateEmailById(updatedEmail,id));
                    break;

                case 12:
                    System.out.println("Enter name whose number yoy want to update");
                    String name = scanner.next();
                    System.out.println("Enter the updated number");
                    long updatedNumber = scanner.nextLong();
                    System.out.println(instituteCentre.updateNumByName(updatedNumber,name));
                    break;

                case 13:
                    System.out.println("Enter placed information");
                    boolean isPlaced = scanner.nextBoolean();
                    System.out.println("Enter the name");
                    String name1 = scanner.next();
                    System.out.println(instituteCentre.updatePlacedByName(isPlaced,name1));
                    break;

                case 14:
                    System.out.println("Enter id whose details you want to delete");
                    System.out.println(instituteCentre.deleteTraineeById(scanner.nextInt()));
                    break;

                default:
                    System.out.println("Please enter valid option");
            }
            System.out.println("Do you want to continue? yes/no");
            val = scanner.next();
        }
        while(val.equalsIgnoreCase("yes"));
        System.out.println("Thak you!");


//        Training trainy = new Training();
//        trainy.setId(1);
//        bookHouse.setBookType(BookType.valueOf(scanner.next().toUpperCase()));
//        trainy.setName("Kavana");
//        trainy.setGenderType(GenderType.Female);
//        trainy.setDoB("02/12/2001");
//        trainy.setPlaced(true);
//        trainy.setPhoneNumber(9099878987l);
//        trainy.setEmail("kavana@gmail.com");
//        trainy.setPlaced(true);
//        trainy.setYearOfGraduation(2021);
//        trainy.setDegreeName("BCA");
//        Institute ins = new InstituteCentre();
//        ins.addTrainee(trainy);
//
//        Training trainee = new Training();
//        trainee.setId(2);
//        trainee.setName("Kavya");
//        trainee.setGenderType(GenderType.Female);
//        trainee.setDoB("06/10/2000");
//        trainee.setPlaced(true);
//        trainee.setPhoneNumber(8976546987l);
//        trainee.setEmail("kavya@gmail.com");
//        trainee.setPlaced(true);
//        trainee.setYearOfGraduation(2023);
//        trainee.setDegreeName("MCA");
//        ins.addTrainee(trainee);
//
//        Training traine = new Training();
//        traine.setId(3);
//        traine.setName("Abhishek");
//        traine.setGenderType(GenderType.Male);
//        traine.setDoB("19/03/2000");
//        traine.setPlaced(true);
//        traine.setPhoneNumber(9876546987l);
//        traine.setEmail("abhishek@gmail.com");
//        traine.setPlaced(true);
//        traine.setYearOfGraduation(2022);
//        traine.setDegreeName("MBA");
//        ins.addTrainee(traine);
//        ins.getDetails();
//
//        ins.getNameById(3);
//
//        ins.getGenderById(2);
//
//        ins.getNameByGender(GenderType.Female);
//
//        ins.getPhoneNumberByName("Abhishek");
//
//        ins.getEmailByName("Akhila");
//
//        ins.getEmailById(3);
//
//        ins.getDOBById(2);
//
//        ins.getDegreeNameByName("Abhilash");
//
//        ins.getYearByDegree("BCA");
//
//        ins.updateEmailById("abhi@gmail.com",5);
//        ins.getEmailById(5);
//
//        ins.updateNumByName(8988796547l,"Akhila");
//        ins.getPhoneNumberByName("Akhila");
//
//        ins.updatePlacedByName(false,"Kavana");
//
//        ins.deleteTraineeById(5);
//        ins.getDetails();

        System.out.println("Main ended");
    }
}
