package com.company;


import java.util.Scanner;
public class EmployPay {
    public static void main (String [] args){
        Scanner Keyboard  = new Scanner(System.in);


        System.out.println("enter employee number");
        int employeeNum = Keyboard.nextInt();

        System.out.println("pay rate");
        int payrate = Keyboard.nextInt();

        System.out.println("Hours worked");
        int hoursworked = Keyboard.nextInt();

        // employees cant get paid more than 25
        if (payrate > 25) {
            System.out.println("Excceds maximum pay");
            System.exit(0);
            // employee cant work more than 35 hours
        } else if (hoursworked>60) {
            System.out.println("Exceeds maximum hours");
            System.exit(0);
            //employee cant work morethan 60 hours and morethan 35 hours they get paid overtime)
        } else if (hoursworked >=35 && hoursworked <= 60) {
            int othours = hoursworked - 35;
            double otpay = (othours) * (payrate * 1.5);
            double wkotpay = (otpay) + (35 * payrate);
            System.out.println("employee number " + employeeNum + "weekly pay " + wkotpay);
        } else if(hoursworked <= 35){
            int  wkpay = (hoursworked) * (payrate);
            System.out.println("employee number " + employeeNum + "weekly pay " + wkpay);
        }
    }
}

