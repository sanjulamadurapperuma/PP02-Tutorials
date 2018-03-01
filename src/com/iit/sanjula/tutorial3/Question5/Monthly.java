package com.iit.sanjula.tutorial3.Question5;

public class Monthly extends Appointment{
    public Monthly(String description, int day, int month) {
        super(description, day, month);
    }

    @Override
    boolean occursOn(int year, int month, int day) {
        return (this.day == day) && (this.month == month);
    }

    @Override
    String getDescription() {
        return description;
    }
}
