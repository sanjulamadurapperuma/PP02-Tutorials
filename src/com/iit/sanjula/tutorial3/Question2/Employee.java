package com.iit.sanjula.tutorial3.Question2;

public class Employee {
    public String name;
    public int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        return name + " " + salary;
    }
}
