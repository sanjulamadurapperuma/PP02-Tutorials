package com.iit.sanjula.tutorial3.Question6;

import java.io.*;
import java.util.ArrayList;

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

    @Override
    public void load(){
        try {
            FileInputStream fileInputStream = new FileInputStream(Appointment.file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Monthly> monthlyAppointments = new ArrayList<Monthly>();
            try{
                while(true){
                    Monthly monthlyAppointment = (Monthly)objectInputStream.readObject();
                    monthlyAppointments.add(monthlyAppointment);
                }
            } catch(ClassNotFoundException ex){
                System.out.printf("ERROR : %s\n" + ex);
            } catch(EOFException ex){
            }
            for(Monthly monthlyAppointment : monthlyAppointments){
                System.out.println(monthlyAppointment);
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
