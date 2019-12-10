package org.fasttrackit;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
//        System.out.print("Hey, what's your name?");
//        Scanner scanner = new Scanner(System.in);
//        String response = scanner.nextLine();
//        System.out.print("Ok," + response + ", how old are you?");
//        int age = scanner.nextInt();
//
//        if (age < 16) {
//            System.out.println("You can't drive, " + response);
//            System.out.println("You can't vote, "+ response);
//            System.out.println("You can't rent a car, "+ response);
//        } else if (age < 18) {
//            System.out.println("You can't vote, "+ response);
//            System.out.println("You can't rent a car, "+ response);
//        } else if (age < 25) {
//            System.out.println("You can't rent a car, "+ response);
//        } else if (age >= 25) {
//            System.out.println("You can do anything that's legal, "+ response);
//        }

        int user = 0;
        System.out.print("Are you ready for a quiz?");
        Scanner scanner = new Scanner(System.in);
        boolean answer = scanner.hasNextBoolean();
        System.out.println("Okay, here it comes!");
        System.out.println("Q1) What is the capital of Romania?");
        System.out.println("      1) Brasov");
        System.out.println("      2) Cluj-Napoca");
        System.out.println("      3) Bucuresti");
        Scanner keyboard = new Scanner(System.in);
        String answer1 = keyboard.nextLine();
        if (answer1.equals("3")) {
            System.out.println("\n" + "That's right");
            answer1 = String.valueOf(1);
        } else {
            answer1 = String.valueOf(0);
        }
        System.out.println("Q2 Can you swim under water for longer than 10 minutes without oxygen tub?");
        System.out.println("      1) yes");
        System.out.println("      2) no");
        Scanner keyboard1 = new Scanner(System.in);
        String answer2 = keyboard1.nextLine();
        if (answer2.equals("1")) {
            System.out.println("Sorry, you can't! You are not a fish!");
            answer2 = String.valueOf(0);
        } else if (answer2.equals("2")) {
            answer2 = String.valueOf(1);
            System.out.println("Good answer!");
        }
        System.out.println("Q3 What is the result of 21*3+(4-6)?");
        System.out.println("      1) 61");
        System.out.println("      2) 69");
        System.out.println("      3) 59");
        Scanner keyboard2 = new Scanner(System.in);
        String answer3 = keyboard2.nextLine();
        if (answer3.equals("1")) {
            System.out.println("That's correct!");
        } else {
            answer3 = String.valueOf(0);
            user = Integer.parseInt(answer3);
        }
        int result = (Integer.parseInt(answer1)) + (Integer.parseInt(answer2)) + (Integer.parseInt(answer3));
        int finalResult = user + result;
        System.out.println("Overall, you got " + finalResult + " out of 3 correct.");
        System.out.println("Thanks for playing!");
    }
}
