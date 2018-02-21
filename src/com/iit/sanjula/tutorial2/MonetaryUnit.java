package com.iit.sanjula.tutorial2;

public class MonetaryUnit {
    //The US monetary system has $1, 5, 10, 20, 50, 100 bills
    private int value;
    private String name;

    public MonetaryUnit(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
