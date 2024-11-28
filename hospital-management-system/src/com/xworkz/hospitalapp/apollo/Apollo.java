package com.xworkz.hospitalapp.apollo;

import com.xworkz.hospitalapp.hospital.Hospital;

public abstract class Apollo implements Hospital {

    @Override
    public String hospitalLaws() {
        return "Maintain Silence";
    }

    @Override
    public String visitingHours() {
        return "Mrng 9:00 to evng 4:30";
    }
}
