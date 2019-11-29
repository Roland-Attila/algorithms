package org.fasttrackit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DumbCalculator {
//    public static void main(String[] args) {
//        System.out.print("What is your first number?");
//        Scanner scanner = new Scanner(System.in);
//        double userChoice = scanner.nextDouble();
//        System.out.print("What is your second number?");
//        double anotherUserChoice = scanner.nextDouble();
//        System.out.print("What is your third number?");
//        double anotherUserChoice1 = scanner.nextDouble();
//        double result = userChoice + anotherUserChoice + anotherUserChoice1;
//
//        System.out.println("(" + userChoice + " + " + anotherUserChoice + " + " + anotherUserChoice1 + ") /2 " + " is ..." + result);
//    }

    public static void main(String[] args) throws IOException {
//        System.out.print("Your height in inches:");
//        Scanner scanner = new Scanner(System.in);
//        double m = scanner.nextDouble();
//        System.out.print("Your weight in pounds:");
//        double kg = scanner.nextDouble();
//        double result = kg / (m * m);
//        System.out.println("Your BMI is " + result);

//        System.out.print("Your height in inches: ");
//        Scanner scanner = new Scanner(System.in);
//        int inches = scanner.nextInt();
//        System.out.print("Your weight in pounds: ");
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int pound = Integer.parseInt(bf.readLine());
//        double inchToMeter = inches * 0.0254;
//        double poundsToKg = pound * 0.4535;
//        double result = poundsToKg / (inchToMeter * inchToMeter);
//        System.out.println("Your BMI is " + result);

        System.out.print("Your height (feet only): ");
        Scanner scanner = new Scanner(System.in);
        double feet = scanner.nextDouble();
        System.out.print("Your height (inches): ");
        double inches = scanner.nextDouble();
        System.out.print("Your weight in pounds: ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int pound = Integer.parseInt(bf.readLine());
        double feetToMeter = feet * 0.3048;
        double inchToMeter = inches * 0.0254;
        double resultFeetWithInch = feetToMeter + inchToMeter;
        double poundToKg = pound * 0.4535;
        double resultAll = poundToKg / (resultFeetWithInch * resultFeetWithInch);

        System.out.println("Your BMI is " + resultAll);
    }
}