package com.iit.sanjula.tutorial3.Question6;

import java.io.*;
import java.util.ArrayList;

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

    @Override
    public void load(){
        try {
            FileInputStream fileInputStream = new FileInputStream(Appointment.file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<OneTime> oneTimeAppointments = new ArrayList<OneTime>();
            try{
                while(true){
                    OneTime oneTimeAppointment = (OneTime) objectInputStream.readObject();
                    oneTimeAppointments.add(oneTimeAppointment);
                }
            } catch(ClassNotFoundException ex){
                System.out.printf("ERROR : %s\n" + ex);
            } catch(EOFException ex){
            }
            for(OneTime oneTimeAppointment : oneTimeAppointments){
                System.out.println(oneTimeAppointment);
            }
            objectInputStream.close();
            fileInputStream.close();
        } catch(FileNotFoundException ex){
            System.out.printf("ERROR : %s\n" + ex);
        } catch(IOException ex){
            System.out.printf("ERROR : %s\n" + ex);
        }
    }
}
