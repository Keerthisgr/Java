package com.xworkz.collection.generics.customtype;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class InstituteRunner {
    public static void main(String[] args) {
        LinkedList<Institute> institute = new LinkedList<>();
        institute.add(new Institute(12,"Xworkz","Java Full Stack",10));
        institute.add(new Institute(23,"JNNCE","MCA",78));
        institute.add(new Institute(56,"Smt.IGGFGWC","BCA",40));
        Collections.sort(institute);
        for (Object obj : institute) {
            System.out.println(obj);
        }
    }
}
