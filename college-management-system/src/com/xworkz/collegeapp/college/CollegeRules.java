package com.xworkz.collegeapp.college;

public abstract class CollegeRules implements College{

    @Override
    public void discipline() {
        System.out.println("Discipline");
    }

    @Override
    public void attendance() {
        System.out.println("Attendance");
    }

    @Override
    public void idCard() {
        System.out.println("ID Card");
    }
    @Override
    public void timeManagement() {
        System.out.println("Time management");
    }
    @Override
    public void doRespectToEveryone() {
        System.out.println("Do respect");
    }
    @Override
    public void wearingUniform() {
        System.out.println("Wearing Uniform");
    }
    @Override
    public void utilizeLibrary() {
        System.out.println("Utilize library");
    }
}
