package com.xworkz.instituteapp.institute;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
