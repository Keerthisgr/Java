package com.xworkz.instituteapp.institute;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Main started");
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
        Institute ins = new InstituteCentre();
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

        ins.deleteTraineeById(5);
        ins.getDetails();

        System.out.println("Main ended");
    }
}
