package com.iit.sanjula.tutorial3.Question2;

public class Manager extends Employee{
    public String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String toString(){
        return name + " " + salary + " " + department;
    }
}
