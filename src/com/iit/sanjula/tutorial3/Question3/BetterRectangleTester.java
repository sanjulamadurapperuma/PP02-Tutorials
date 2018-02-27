package com.iit.sanjula.tutorial3.Question3;

public class BetterRectangleTester {
    public static void main(String[] args){
        BetterRectangle rectangle1 = new BetterRectangle(25, 50, 76, 45);
        double perimeter = rectangle1.getPerimeter();
        double area = rectangle1.getArea();
        System.out.println("Perimeter is : " + perimeter);
        System.out.println("Area is : " + area);
    }
}
