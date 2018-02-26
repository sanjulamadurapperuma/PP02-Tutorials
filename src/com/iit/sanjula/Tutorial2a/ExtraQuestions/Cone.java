package com.iit.sanjula.Tutorial2a.ExtraQuestions;

public class Cone {
    private double r;
    private double h;

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    private double getVolume(double r, double h){
        return Math.PI * Math.pow(r, 2) * (h / 3);
    }
    private double getSurfaceArea(double r, double h){
        return Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
    }
}
