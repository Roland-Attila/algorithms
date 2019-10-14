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

//    public double anotherForExercise5(int start) {
//        for (int i = start; i <= 100; i++) {
//            System.out.println(i + i);
//            return double;
//        }
//    }
}