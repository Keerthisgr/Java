package com.xworkz.collegeapp.college;

public class CollegeSubRules extends CollegeRules{

    @Override
    public void vehiclesNotAllowed() {
        System.out.println("Vehicle Not Allowed");
    }

    @Override
    public void goalOriented() {
        System.out.println("Goal Oriented");
    }

    @Override
    public void stayHealthy() {
        System.out.println("Stay healthy");
    }
}
