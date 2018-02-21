package com.iit.sanjula.tutorial3.Question1;

public class Student extends Person {
    private String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    public String toString(){
        return name + " " + yearOfBirth + " " + major;
    }
}
