package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.MedicalShop;
import com.xworkz.medicalapp.medicines.Medicines;

public class MedicalTester
{
    public static void main(String[] args) {
        MedicalShop mes = new MedicalShop();
        Medicines m = new Medicines();
        mes.setMedicineId(89);
        mes.setMedicineName("Ascoril D Plus Syrup");
        mes.setMedicineType("Syrup");
        mes.setQuantity("200ml");
        mes.setPrice(250.90);
        m.addMedicine(mes);
        m.getDetails();
    }
}
