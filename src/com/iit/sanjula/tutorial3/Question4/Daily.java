package com.iit.sanjula.tutorial3.Question4;

public class Daily extends Appointment {

    public Daily(String description, int day) {
        super(description, day);
    }

    @Override
    boolean occursOn(int year, int month, int day) {
        return (this.day == day);
    }

    String getDescription() {
        return description;
    }
}
