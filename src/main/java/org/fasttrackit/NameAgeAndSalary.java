package org.fasttrackit;

import java.util.Scanner;

public class NameAgeAndSalary {

    public static void main(String[] args) {
//        System.out.println("Hello. What is your name?");
//        Scanner keyboard = new Scanner(System.in);
//        String text = keyboard.nextLine();
//        System.out.println("Hi, " + text + "! How old are you?");
//        int age = keyboard.nextInt();
//        System.out.println("So you're " + age + ", eh? That's not old at all!");
//        System.out.println("How much do you make, " + text + "?");
//        double salary = keyboard.nextDouble();
//        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");

        System.out.println("Please enter the following information so I can sell it for a profit!");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("First name: ");
        String name = keyboard.nextLine();
        System.out.print("Last name: ");
        String lastName = keyboard.nextLine();
        System.out.print("Grade (9-12): ");
        int grade = keyboard.nextInt();
        System.out.print("Student ID: ");
        int id = keyboard.nextInt();
        System.out.print("Login: ");


        String login = new Scanner(System.in).nextLine();
        System.out.print("GPA (0.0-4.0): ");
        double gpa = keyboard.nextDouble();

        System.out.println("Your information:");
        System.out.println("              Login:" + login);
        System.out.println("              ID:" + id);
        System.out.println("              Name:" + name);
        System.out.println("              GPA:" + gpa);
        System.out.println("              Grade:" + grade);
    }
}