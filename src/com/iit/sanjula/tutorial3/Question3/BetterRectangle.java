package com.iit.sanjula.tutorial3.Question3;

public class BetterRectangle extends java.awt.Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        super.setLocation(x, y);
        super.setSize(width, height);
    }

    public double getPerimeter(){
        return super.getHeight() * 2 + super.getWidth() * 2;
    }

    public double getArea(){
        return super.getHeight() * super.getWidth();
    }
}
