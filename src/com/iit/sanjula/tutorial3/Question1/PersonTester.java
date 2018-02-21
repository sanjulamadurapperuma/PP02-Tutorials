package com.iit.sanjula.tutorial3.Question1;

public class PersonTester {
    public static void main(String[] args){
        Person person1 = new Person("John", 1995);
        Student student1 = new Student("John", 1999, "Computer Science");
        Instructor instructor1 = new Instructor("Smith", 1965, 150000);

        System.out.println("Person : " + person1);
        System.out.println("Student : " + student1);
        System.out.println("Instructor : " + instructor1);
    }
}
