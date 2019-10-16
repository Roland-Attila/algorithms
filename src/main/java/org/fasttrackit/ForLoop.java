package org.fasttrackit;

public class ForLoop {
    public void forExercise(int start) {
        for (int i = start; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 7 == 0) {
                System.out.print("\n");
            }
        }
    }

    public void anotherForExercise(int start) {
        System.out.println("\n");
        for (int i = start; i >= -100; i--) {
            System.out.print(i + " ");
            if (i % -10 == 0) {
                System.out.print("\n");
            }
        }
    }

    public void anotherForExercise1(int start, int end) {
        System.out.println("\n");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            if (i % 20 == 0) {
                System.out.print("\n");
            }
        }
    }

    public void anotherForExercise2(int start, int end) {
        System.out.println("\n");
        for (int i = start; i <= end; i++) {
            if (start > end || start < end) {
                System.out.print(i + " ");
            }
            if (i % 10 == 0) {
                System.out.print("\n");
            }
        }
    }

    public void anotherForExercise3(int start, int end) {
        System.out.println("\n");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            if (i % 20 == 0) {
                System.out.print("\n");
            }
        }
    }

    public void anotherForExercise4(int start, int end) {
        System.out.println("\n");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            if (i % 20 == 0) {
                System.out.print("\n");
            }
        }
    }

    public int anotherForExercise5(int start) {
        int j = 0;
        for (int i = start; i <= 100; i++) {
            j = j + i;
        }
        System.out.println("\n");
        System.out.println(j);
        return j;
    }

    public double anotherForExercise6(int start) {
        double k = 5.8;
        int l = 1;
        double rezultat = 1;
        for (int i = start; i <= 100; i++) {
            k = k + i;
            l++;
            rezultat = k / l;
        }
        System.out.println("\n");
        System.out.println(rezultat);
        return rezultat;
    }

    public void anotherForExercise7() {
        System.out.println("\n");
        for (int i = 1; i <= 7; i++) {
            if (i <= 1)
                System.out.println("*******");
            else if (i <= 2)
                System.out.println("******");
            else if (i <= 3)
                System.out.println("*****" + "\n");
            else if (i <= 4)
                System.out.println("****");
            else if (i <= 5)
                System.out.println("***");
            else if (i <= 6)
                System.out.println("**");
            else if (i <= 7)
                System.out.println("*");
        }
    }
}