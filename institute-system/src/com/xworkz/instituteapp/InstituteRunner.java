package com.xworkz.instituteapp;

import com.xworkz.instituteapp.gendertype.GenderType;
import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.training.Training;

public class InstituteRunner {
    public static void main(String[] args) {
        System.out.println("Main started!!..");
        Training trainy = new Training();
        trainy.setId(1);
        trainy.setName("Kavana");
        trainy.setGenderType(GenderType.Female);
        trainy.setDoB("02/12/2001");
        trainy.setPlaced(true);
        trainy.setPhoneNumber(9099878987l);
        trainy.setEmail("kavana@gmail.com");
        trainy.setPlaced(true);
        trainy.setYearOfGraduation(2021);
        trainy.setDegreeName("BCA");

        Institute ins = new Institute();
        ins.addTrainee(trainy);


        Training trainee = new Training();
        trainee.setId(2);
        trainee.setName("Kavya");
        trainee.setGenderType(GenderType.Female);
        trainee.setDoB("06/10/2000");
        trainee.setPlaced(true);
        trainee.setPhoneNumber(8976546987l);
        trainee.setEmail("kavya@gmail.com");
        trainee.setPlaced(true);
        trainee.setYearOfGraduation(2023);
        trainee.setDegreeName("MCA");
        ins.addTrainee(trainee);


        Training traine = new Training();
        traine.setId(3);
        traine.setName("Abhishek");
        traine.setGenderType(GenderType.Male);
        traine.setDoB("19/03/2000");
        traine.setPlaced(true);
        traine.setPhoneNumber(9876546987l);
        traine.setEmail("abhishek@gmail.com");
        traine.setPlaced(true);
        traine.setYearOfGraduation(2022);
        traine.setDegreeName("MBA");
        ins.addTrainee(traine);


        Training trainer = new Training();
        trainer.setId(4);
        trainer.setName("Abhilash");
        trainer.setGenderType(GenderType.Male);
        trainer.setDoB("29/07/2000");
        trainer.setPlaced(true);
        trainer.setPhoneNumber(8978546987l);
        trainer.setEmail("abhlash@gmail.com");
        trainer.setPlaced(true);
        trainer.setYearOfGraduation(2024);
        trainer.setDegreeName("BE");
        ins.addTrainee(trainer);



        Training tra = new Training();
        tra.setId(5);
        tra.setName("Akhila");
        tra.setGenderType(GenderType.Female);
        tra.setDoB("29/07/2000");
        tra.setPlaced(true);
        tra.setPhoneNumber(7823146987l);
        tra.setEmail("akhila@gmail.com");
        tra.setPlaced(true);
        tra.setYearOfGraduation(2024);
        tra.setDegreeName("MCA");
        ins.addTrainee(tra);
        ins.getDetails();

        ins.getNameById(3);

        ins.getGenderById(2);

        ins.getNameByGender(GenderType.Female);

        ins.getPhoneNumberByName("Abhishek");

        ins.getEmailByName("Akhila");

        ins.getEmailById(3);

        ins.getDOBById(2);

        ins.getDegreeNameByName("Abhilash");

        ins.getYearByDegree("BCA");

        ins.updateEmailById("abhi@gmail.com",5);
        ins.getEmailById(5);

        ins.updateNumByName(8988796547l,"Akhila");
        ins.getPhoneNumberByName("Akhila");

        ins.updatePlacedByName(false,"Kavana");
        ins.getDetails();

        ins.deleteTraineeById(5);
        ins.getDetails();
        System.out.println("Main ended!!...");
    }
}
