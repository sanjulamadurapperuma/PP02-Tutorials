package com.iit.sanjula.Tutorial2a.ExtraQuestions;

public class Cube {
    private double h;

    public Cube(double h) {
        this.h = h;
    }

    public double getVolume(double h){
        return Math.pow(h, 3);
    }

    public double getSurfaceArea(double h){
        return 6 * Math.pow(h, 2);
    }
}
