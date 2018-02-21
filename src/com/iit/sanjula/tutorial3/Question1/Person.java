package com.iit.sanjula.tutorial3.Question1;

public class Person {
    public String name;
    public int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String toString(){
        return name + " " + yearOfBirth;
    }
}
