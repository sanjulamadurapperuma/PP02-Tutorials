package com.iit.sanjula.tutorial1.Question3;

public class CarTester {
    public static void main(String[] args) {
        Car myHybrid = new Car(50);//50 kilometers per litre
        myHybrid.addGas(20);//Tank 20 litres
        myHybrid.drive(100);//Drive 100 kilometers
        double gasLeft = myHybrid.getGasInTank();//Get gas remaining in tank
        System.out.println("The gas left in the fuel tank is : " + gasLeft);
        System.out.println("Expected Value : 18.0");
    }
}
