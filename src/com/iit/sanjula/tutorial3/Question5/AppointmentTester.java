package com.iit.sanjula.tutorial3.Question5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentTester {
    public static List<Appointment> appointments = new ArrayList<Appointment>();
    public static void main(String[] args){

//        Daily dailyAppointment = new Daily("See the doctor", 25);
//        Monthly monthlyAppointment = new Monthly("See the doctor 1", 24, 11);
//        OneTime onetimeAppointment = new OneTime("See the doctor 2", 10, 02, 2018);
//        OneTime onetimeAppointment1 = new OneTime("See the doctor 3", 10, 02, 2018);
//        appointments.add(dailyAppointment);
//        appointments.add(monthlyAppointment);
//        appointments.add(onetimeAppointment);
//        appointments.add(onetimeAppointment1);

        String description, continue2;
        int type, day, month, year;
        Appointment appointment = null;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select the type of appointment you want to make : ");
            System.out.println("Enter '1' for Daily Appointment");
            System.out.println("Enter '2' for Monthly Appointment");
            System.out.println("Enter '3' for One Time Appointment");
            System.out.println("Enter '0' to exit");
            System.out.println();
            type = scanner.nextInt();
            scanner.nextLine();//Flushing the next line
            System.out.println("Enter Description : ");
            description = scanner.nextLine();
            System.out.println("Please enter the day : ");
            day = scanner.nextInt();
            System.out.println("Please enter the month : ");
            month = scanner.nextInt();
            System.out.println("Please enter the year : ");
            year = scanner.nextInt();
            if (type == 1) {
                appointment = new Daily(description, day);
            } else if (type == 2) {
                appointment = new Monthly(description, day, month);
            } else if (type == 3) {
                appointment = new OneTime(description, day, month, year);
            } else if(type == 0){
                System.exit(0);
            }
            appointments.add(appointment);
            System.out.println("Do you want to add another appointment? If yes, enter 'Yes', else 'No'");
            continue2 = scanner.next();
        }while (!continue2.equalsIgnoreCase("No"));
        System.out.println("The appointments that are currently recorded are : ");
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

//    public void showAppointments(){
//        for (Appointment a : appointments){
//            System.out.println(a.toString());
//        }
//    }
}
