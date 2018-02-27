package com.iit.sanjula.tutorial3.Question2;

public class EmployeeTester {
    public static void main(String[] args){
        Employee employee1 = new Employee("Katie", 150000);
        Manager manager1 = new Manager("Jasmine", 500000, "Marketing");
        Executive executive1 = new Executive("George", 10000000, "Management");

        System.out.println("Employee : " + employee1);
        System.out.println("Manager : " + manager1);
        System.out.println("Executive : " + executive1);
    }
}
