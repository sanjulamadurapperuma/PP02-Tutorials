package com.iit.sanjula.tutorial3.Question6_v1;

import java.text.DateFormat;
import java.util.Date;

public class Appointment {
    private String date;
    private String description;

    public Appointment(String aDate, String aDescription) {
        this.date = aDate;
        this.description = aDescription;
    }

    public static DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

    @Override
    public String toString() {
        return "Appointment[date=" +
                formatter.format(date) +
                "description=" + description + "; " +
                "]";
    }
}
