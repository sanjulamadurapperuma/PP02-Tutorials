package com.iit.sanjula.tutorial3.Question5;

public abstract class Appointment {
    public String description;
    public int day;
    public int month;
    public int year;

    public Appointment(String description, int day) {
        this.description = description;
        this.day = day;
    }//Daily

    public Appointment(String description, int day, int month) {
        this.description = description;
        this.day = day;
        this.month = month;
    }//Monthly

    public Appointment(String description, int day, int month, int year) {
        this.description = description;
        this.day = day;
        this.month = month;
        this.year = year;
    }//Onetime

    abstract boolean occursOn(int year, int month, int day);

    abstract String getDescription();

    @Override
    public String toString() {
        return "\nDescription : " + description + "\nDay : "
                + day + "\nMonth : " + month + "\nYear : " + year;
    }
}
