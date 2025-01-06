package com.xworkz.collection.generics.customtype;

import com.xworkz.collection.generics.comparator.DescriptionComparator;
import com.xworkz.collection.generics.comparator.FromAddressComparator;

import java.util.Collections;
import java.util.LinkedList;

public class GmailRunner {
    public static void main(String[] args) {
        LinkedList<Gmail> linkedList = new LinkedList<>();
        linkedList.add(new Gmail("keerthisr@gmail.com","rachana@gmail.com","Happy birthday"));
        linkedList.add(new Gmail("adhya@gmail.com","archana@gmail.com","Requesting for a leave"));
        linkedList.add(new Gmail("kiran@gmail.com","abhi@gmail.com","Congrats"));
        Collections.sort(linkedList);
        for (Object obj : linkedList) {
            System.out.println(obj);
        }
        System.out.println("Sort by from address");
        Collections.sort(linkedList,new FromAddressComparator());
        for (Object obj : linkedList) {
            System.out.println(obj);
        }
        System.out.println("Sort by description");
        Collections.sort(linkedList,new DescriptionComparator());
        for (Object obj : linkedList) {
            System.out.println(obj);
        }
    }
}
