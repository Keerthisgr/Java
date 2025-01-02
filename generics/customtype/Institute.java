package com.xworkz.collection.generics.customtype;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Institute {
    private int instituteId;
    private String instituteName;
    private  String courseName;
    private int numberOfTrainee;
}
