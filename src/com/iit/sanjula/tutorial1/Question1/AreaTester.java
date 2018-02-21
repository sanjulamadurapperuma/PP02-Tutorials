package com.iit.sanjula.tutorial1.Question1;

public class AreaTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        double area = r1.getWidth() * r1.getHeight();
        System.out.println("The Area is : " + area);
        System.out.println("Expected Value : 50.0");
    }
}
