package com.iit.sanjula.tutorial1.Question1;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width > 0){
            this.width = width;
        } else{
            System.out.println("The width you entered is below zero. Calculation not possible.");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height > 0){
            this.height = height;
        } else{
            System.out.println("The height you entered is below zero. Calculation not possible.");
        }
    }
}
