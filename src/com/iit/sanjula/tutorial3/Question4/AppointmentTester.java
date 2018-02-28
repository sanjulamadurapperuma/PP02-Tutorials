package com.iit.sanjula.tutorial3.Question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentTester {
    public static List<Appointment> appointments = new ArrayList<Appointment>();
    public static void main(String[] args){

        Daily dailyAppointment = new Daily("See the doctor", 25);
        Monthly monthlyAppointment = new Monthly("See the doctor 1", 24, 11);
        OneTime onetimeAppointment = new OneTime("See the doctor 2", 10, 02, 2018);
        OneTime onetimeAppointment1 = new OneTime("See the doctor 3", 10, 02, 2018);
        appointments.add(dailyAppointment);
        appointments.add(monthlyAppointment);
        appointments.add(onetimeAppointment);
        appointments.add(onetimeAppointment1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year : ");
        int year = scanner.nextInt();
        System.out.println("Please enter the month : ");
        int month = scanner.nextInt();
        System.out.println("Please enter the day : ");
        int day = scanner.nextInt();
        System.out.println(occursOn(year, month, day));
    }

    public static List<Appointment> occursOn(int year, int month, int day){
        List<Appointment> result = new ArrayList<Appointment>();

       for (Appointment appointment : appointments){
           if (appointment.occursOn(year, month, day)){
               result.add(appointment);
           }
       }
       return result;
    }
}
