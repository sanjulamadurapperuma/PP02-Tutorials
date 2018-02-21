package com.iit.sanjula.tutorial1.Question1;

public class PerimeterTester {
    public static void main(String[] args) {
        Rectangle r2 = new Rectangle(5, 10);
        double perimeter = 2 * ((r2.getWidth()) + (r2.getHeight()));
        System.out.println("The perimeter is : " + perimeter);
        System.out.println("Expected Value : 30.0");
    }
}
