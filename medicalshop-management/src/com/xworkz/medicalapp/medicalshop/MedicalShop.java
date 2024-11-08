package com.xworkz.medicalapp.medicalshop;

public class MedicalShop {
    private int medicineId;
    private String medicineName;
    private String medicineType;
    private String quantity;
    private double price;

    public MedicalShop() {
        System.out.println("Default constructor is invoked!!..");
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
