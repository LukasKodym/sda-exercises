package com.lukas.project;

public class Person {

    String name, lastName;
    Integer age;


    public Person(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("\n%s, %s, %d",  name, lastName, age);
    }

    public static Person[] exampleArray() {

        Person[] person = new Person[5];
        person[0] = new Person("Anna", "Bajer", 25);
        person[1] = new Person("Zenek", "Kaska", 23);
        person[2] = new Person("Bartoes", "Graniec", 47);
        person[3] = new Person("Patrycja", "Stanek", 27);
        person[4] = new Person("Paweł", "Wolski", 33);

        return person;
    }


}
