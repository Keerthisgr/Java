package com.xworkz.collegeapp.college;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main started");
        College clg = new CollegeSubRules();
        clg.attendance();
        clg.discipline();
        clg.doRespectToEveryone();
        clg.idCard();
        clg.goalOriented();
        clg.utilizeLibrary();
        clg.timeManagement();
        System.out.println("Main ended");
    }
}
