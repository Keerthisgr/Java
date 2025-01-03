package com.xworkz.collection.generics.customtype;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Institute implements Comparable<Institute>{
    private int instituteId;
    private String instituteName;
    private  String courseName;
    private int numberOfTrainee;

    @Override
    public int compareTo(Institute o) {
        return this.getInstituteId() - o.getInstituteId();
    }
}
