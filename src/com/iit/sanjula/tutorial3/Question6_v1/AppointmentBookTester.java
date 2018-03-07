package com.iit.sanjula.tutorial3.Question6_v1;

import java.util.Scanner;

public class AppointmentBookTester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while(!done){
            System.out.println("Next date (or -1 when done):");
            String input1 = in.nextLine();

            if (input1.equals("-1")){
                done = true;
            } else{
                System.out.println("Description: ");
                String input2 = in.nextLine();
                AppointmentBook.add(input1, input2);
            }
        }
        System.out.println(AppointmentBook.book);
    }
}
