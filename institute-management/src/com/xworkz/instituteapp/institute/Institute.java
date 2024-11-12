package com.xworkz.instituteapp.institute;

public class Institute {
    private String batchCode;
    private int noOfTrainee;

    public Institute() {
        System.out.println("Institute default constructor");
    }
    public void Info(String batchCode,int noOfTrainee){
        this.batchCode = batchCode;
        this.noOfTrainee = noOfTrainee;
    }
}
