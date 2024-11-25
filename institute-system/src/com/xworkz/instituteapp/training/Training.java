package com.xworkz.instituteapp.training;

import com.xworkz.instituteapp.gendertype.GenderType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Training {
    private int id;
    private String name;
    private int yearOfGraduation;
    private String degreeName;
    private String doB;
    private String email;
    private GenderType genderType;
    private long phoneNumber;
    private boolean isPlaced;
}
