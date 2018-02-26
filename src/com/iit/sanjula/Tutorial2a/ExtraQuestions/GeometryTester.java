package com.iit.sanjula.Tutorial2a.ExtraQuestions;

import java.util.Scanner;

public class GeometryTester {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a value for r : ");
        double r = scanner.nextDouble();
        System.out.print("Please enter a value for h : ");
        double h = scanner.nextDouble();

        System.out.println("Volume of a Cube : " + Geometry.cubeVolume(h));
        System.out.println("Surface Area of a Cube : " + Geometry.cubeSurface(h));
        System.out.println("Volume of a Sphere : " + Geometry.sphereVolume(r));
        System.out.println("Surface Area of a Sphere : " + Geometry.sphereSurface(r));
        System.out.println("Volume of a Cylinder : " + Geometry.cylinderVolume(r, h));
        System.out.println("Surface Area of a Cylinder : " + Geometry.cylinderSurface(r, h));
        System.out.println("Volume of a Cone : " + Geometry.coneVolume(r, h));
        System.out.println("Surface Area of a Cone : " + Geometry.coneSurface(r, h));
    }
}
