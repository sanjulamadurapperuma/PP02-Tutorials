package com.iit.sanjula.tutorial3.Question6;

import java.io.*;
import java.util.ArrayList;

public abstract class Appointment {
    public static File file = new File("appointments.txt");
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

    public void save(){
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        for (Appointment appointment : appointments){
            appointments.add(appointment);
        }
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Appointment appointment : appointments){
                objectOutputStream.writeObject(appointment);
            }
            objectOutputStream.close();
            fileOutputStream.close();
        } catch(FileNotFoundException ex){
            System.out.printf("ERROR : %s\n" + ex);
        } catch (IOException ex){
            System.out.printf("ERROR : %s\n" + ex);
        }
    }

    public void load(){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Appointment> appointments2 = new ArrayList<Appointment>();
            try{
                while(true){
                    Appointment appointment = (Appointment)objectInputStream.readObject();
                    appointments2.add(appointment);
                }
            } catch(ClassNotFoundException ex){
                System.out.printf("ERROR : %s\n" + ex);
            } catch(EOFException ex){
            }
            for(Appointment appointment : appointments2){
                System.out.println(appointment);
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
