package com.xworkz.stationapp.metro;

public class Metro {
    private int trainId;
    private String trainName;
    private String sourceStation;
    private String destinationStation;
    private String line;

    public Metro() {
        System.out.println("Default constructor is invoked!!..");
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }
}
