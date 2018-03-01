package com.iit.sanjula.tutorial3.Question5;

public class OneTime extends Appointment{
    public OneTime(String description, int day, int month, int year) {
        super(description, day, month, year);
    }

    @Override
    boolean occursOn(int year, int month, int day) {
        return (this.year == year) && (this.month == month) && (this.day == day);
    }

    @Override
    String getDescription() {
        return description;
    }
}
