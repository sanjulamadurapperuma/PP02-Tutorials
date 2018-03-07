package com.iit.sanjula.tutorial3.Question6_v1;

import java.util.ArrayList;
import java.util.Date;

public class AppointmentBook {
    public static ArrayList<Appointment> book;

    public AppointmentBook(){
        book = new ArrayList<Appointment>();
    }

    public void addAll(ArrayList<Appointment> list){
        book.addAll(list);
    }

    public int getNumAppointments(){
        return book.size();
    }

    public Appointment getAppointment(int i){
        return book.get(i);
    }

    public String toString(){
        String out = "";
        for (Appointment a : book){
            out = out + a.toString() + "\n";
        }
        return out;
    }

    public static void add(String aDate, String aDescription){
        Appointment appointment = new Appointment(aDate, aDescription);
        book.add(appointment);
    }
}
