package org.fasttrackit;

import java.util.Scanner;

public class NameAgeAndSalary {

    public static void main(String[] args) {
        System.out.println("Hello. What is your name?");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        System.out.println("Hi, " + text + "! How old are you?");
        int age = keyboard.nextInt();
        System.out.println("So you're " + age + ", eh? That's not old at all!");
        System.out.println("How much do you make, " + text + "?");
        double salary = keyboard.nextDouble();
        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
    }
}