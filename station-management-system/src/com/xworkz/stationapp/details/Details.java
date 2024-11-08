package com.xworkz.stationapp.details;

import com.xworkz.stationapp.metro.Metro;

public class Details {
    Metro metro;
    public boolean addTrainInfo(Metro metro){
        boolean isTrainInfoAdded = false;
        if(metro!=null){
            if(metro.getTrainId()>0&&metro.getTrainName()!=null){
                this.metro = metro;
                isTrainInfoAdded = true;
            }else{
                System.out.println("No Empty Space");
            }
        }else{
            System.out.println("Already filled!!..");
        }return isTrainInfoAdded;
    }
    public void getInformation(){
        System.out.println("Train Id: "+metro.getTrainId());
        System.out.println("Train name: "+metro.getTrainName());
        System.out.println("Source station: "+metro.getSourceStation());
        System.out.println("Destination station: "+metro.getDestinationStation());
        System.out.println("Line "+metro.getLine());
    }

}
