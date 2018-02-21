package com.iit.sanjula.tutorial3.Question1;

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public String toString(){
        return name + " " + yearOfBirth + " " + String.valueOf(salary);
    }
}
