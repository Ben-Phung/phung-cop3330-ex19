/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Prompt user
        System.out.print("What is your height in inches? ");
        String Height = scan.nextLine();
        // Use try and catch function to test if input is a number
        try {
            double dHeight = Double.parseDouble(Height);
        } catch (NumberFormatException ex) {
            System.out.println( "Please retry and enter a number" );
        }

        System.out.print("What is your weight in pounds? ");
        String Weight = scan.nextLine();

        try {
            double dWeight = Double.parseDouble(Weight);
        } catch (NumberFormatException ex) {
            System.out.println( "Please retry and enter a number" );
        }

        // String to double
        double dHeight = Double.parseDouble(Height);
        double dWeight = Double.parseDouble(Weight);

        // First output
        double BMI = (dWeight / (dHeight * dHeight)) * 703;
        System.out.println("Your BMI is " + String.format("%.1f",BMI) + ".");
        // Second output
        if( BMI >= 18.5 && BMI <= 25)
            System.out.println( "You are within the ideal weight range." );

        else if( BMI < 18.5)
            System.out.println( "You are underweight. You should see your doctor." );

        else if( BMI > 25)
            System.out.println( "You are overweight. You should see your doctor." );


    }
}
