package com.iit.sanjula.Tutorial2a.ExtraQuestions;

import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the radius : ");
        double r = scanner.nextDouble();

        System.out.println("Please enter the height : ");
        double h = scanner.nextDouble();

        Cube cube = new Cube(h);
        double volume = cube.getVolume();
        double surfaceArea = cube.getSurfaceArea();

        System.out.println("The volume of the Cube is : " + volume);
        System.out.println("The surface area of the Cube is : " + surfaceArea);

        Sphere sphere = new Sphere(r);
        volume = sphere.getVolume();
        surfaceArea = sphere.getSurfaceArea();

        System.out.println("The volume of the Sphere is : " + volume);
        System.out.println("The surface area of the Sphere is : " + surfaceArea);

        Cylinder cylinder = new Cylinder(r, h);
        volume = cylinder.getVolume();
        surfaceArea = cylinder.getSurfaceArea();

        System.out.println("The volume of the Cylinder is : " + volume);
        System.out.println("The surface area of the Cylinder is : " + surfaceArea);

        Cone cone = new Cone(r, h);
        volume = cone.getVolume();
        surfaceArea = cone.getSurfaceArea();

        System.out.println("The volume of the Cone is : " + volume);
        System.out.println("The surface area of the Cone is : " + surfaceArea);
    }
}
