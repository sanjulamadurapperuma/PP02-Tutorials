package com.iit.sanjula.Tutorial2a.ExtraQuestions;

public class Cylinder {
    private double r;
    private double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    private double getVolume(double r, double h){
        return Math.PI * Math.pow(r, 2) * h;
    }

    private double getSurfaceArea(double r, double h){
        return (2 *  Math.PI * r * h) + (2 * Math.PI + Math.pow(r, 2));
    }
}
