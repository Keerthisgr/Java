package com.xworkz.medicalapp.medicines;

import com.xworkz.medicalapp.medicalshop.MedicalShop;

public class Medicines {
    MedicalShop medicalShop;
    public boolean addMedicine(MedicalShop medicalShop){
    boolean isAddMedicine = false;
    if(medicalShop != null){
        if(medicalShop.getMedicineId() > 0 && medicalShop.getMedicineName() != null){
            this.medicalShop = medicalShop;
            isAddMedicine = true;
        }else{
            System.out.println("No empty space!!..");
        }
    }else{
        System.out.println("Already filled!!..");
    }return  isAddMedicine;
    }
    public void getDetails(){
        System.out.println("Medicine Id: "+medicalShop.getMedicineId());
        System.out.println("Medicine Name: "+medicalShop.getMedicineName());
        System.out.println("Medicine Type: "+medicalShop.getMedicineType());
        System.out.println("Medicine quantity: "+medicalShop.getQuantity());
        System.out.println("Medicine price: "+medicalShop.getPrice());
    }
}
