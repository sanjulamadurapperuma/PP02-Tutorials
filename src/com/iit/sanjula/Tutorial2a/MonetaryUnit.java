package com.iit.sanjula.Tutorial2a;

public class MonetaryUnit {
    private double value;
    private String name;

    public MonetaryUnit(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
