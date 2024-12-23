package com.xworkz.libraryapp.library;

import java.util.ArrayList;
import java.util.Collection;

public class Fiction {
    public static void main(String[] args) {
        System.out.println("****************Collection******************");
        Collection collection = new ArrayList();
        collection.add(1926);
        collection.add(34);
        collection.add(67);
        collection.add(89);
        collection.add(07);
        System.out.println(collection);


        System.out.println("********Collection 2************");
        Collection collection2 = new ArrayList();
        collection2.add(1289);
        collection2.add(907);
        System.out.println(collection2);

        System.out.println("*************Adding same collection elements to collection1*****************");
        Collection collection1 = new ArrayList();
        boolean isAdded = collection1.addAll(collection);
        System.out.println("Data added successfully!! "+isAdded);
        System.out.println(collection1);


        System.out.println("***********equals method***************");
        boolean isItTrue = collection1.equals(collection);
        System.out.println(isItTrue);



        boolean isItTrueOrFalse = collection1.equals(collection2);
        System.out.println(isItTrueOrFalse);


        System.out.println("************forEach method************");
        collection.forEach(System.out::println);


        System.out.println("**************ContainsAll()**********************");
        boolean isItContainsAll = collection1.containsAll(collection);
        System.out.println(isItContainsAll);

        System.out.println("******************contains()*************");
        Collection collection4 = new ArrayList();
        collection4.add(2);

        Collection collection5 = new ArrayList();
        collection5.add(2);
        boolean isItContains = collection4.contains(2);
        System.out.println(isItContains);


        System.out.println("***********hashCode()*****************");
        int num = collection.hashCode();
        System.out.println(num);


        System.out.println("***********isEmpty()****************");
        System.out.println(collection2.isEmpty());


        System.out.println("**********retainAll()****************");
        System.out.println(collection2.retainAll(collection5));

        System.out.println(collection1.retainAll(collection));

        System.out.println("********size()*****************");
        int num1 = collection2.size();
        System.out.println(num1);

        System.out.println("**************remove()*****************");
        collection.remove(collection);

        System.out.println("***********clear()*****************");
        collection1.clear();
        System.out.println(collection1);


    }

}
