package com.lukas.project;

import java.util.*;



public class PersonExecute extends SortingMethods{

    public static void main(String[] args) {
        Person[] person = Person.exampleArray();
        //inSort(person);
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
    }



}
