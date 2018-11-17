package com.lukas.project;

import java.lang.reflect.Array;
import java.util.*;


public class PersonExecute extends SortingMethods {

    public static void main(String[] args) {
        Person[] person = Person.exampleArray();
        //inSort(person);
//        SortingMethods.bubbleSort(Person.exampleArray());
        System.out.println(Arrays.toString(person));

    }


}
