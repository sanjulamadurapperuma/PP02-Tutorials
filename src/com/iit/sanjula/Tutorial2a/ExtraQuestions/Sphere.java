package com.iit.sanjula.Tutorial2a.ExtraQuestions;

public class Sphere {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    private double getVolume(double r){
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    private double getSurfaceArea(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }
}
