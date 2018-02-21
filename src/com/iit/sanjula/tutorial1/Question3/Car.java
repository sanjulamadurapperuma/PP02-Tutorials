package com.iit.sanjula.tutorial1.Question3;

public class Car {
    double fuelEfficiency;
    double gasInTank;

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public void drive(int kilometers){
        gasInTank -= (kilometers / fuelEfficiency);
    }

    public void addGas(double litresAdded){
        gasInTank += litresAdded;
    }

    public double getGasInTank() {
        return gasInTank;
    }

    public void setGasInTank(double gasInTank) {
        this.gasInTank = gasInTank;
    }
}
