package com.iit.sanjula.tutorial3.Question6;

import java.io.*;
import java.util.ArrayList;

public class Daily extends Appointment{

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


    @Override
    public void load(){
        try {
            FileInputStream fileInputStream = new FileInputStream(Appointment.file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Daily> dailyAppointments = new ArrayList<Daily>();
            try{
                while(true){
                    Daily dailyAppointment = (Daily)objectInputStream.readObject();
                    dailyAppointments.add(dailyAppointment);
                }
            } catch(ClassNotFoundException ex){
                System.out.printf("ERROR : %s\n" + ex);
            } catch(EOFException ex){
            }
            for(Daily dailyAppointment : dailyAppointments){
                System.out.println(dailyAppointment);
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
