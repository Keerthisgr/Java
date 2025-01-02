package com.xworkz.collection.generics.customtype;

import java.util.HashSet;

public class InstituteRunner {
    public static void main(String[] args) {
        HashSet<Institute> institute = new HashSet<>();
        institute.add(new Institute(12,"Xworkz","Java Full Stack",10));
        institute.add(new Institute(23,"JNNCE","MCA",78));
        institute.add(new Institute(56,"Smt.IGGFGWC","BCA",40));
        for (Object obj : institute) {
            System.out.println(obj);
        }
    }
}
