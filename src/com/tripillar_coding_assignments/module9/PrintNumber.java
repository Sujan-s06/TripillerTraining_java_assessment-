package com.tripillar_coding_assignments.module9;

public class PrintNumber {
    public static void printNumbers(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.println(current);
        printNumbers(current + 1, n);
    }

    public static void main(String[] args) {
        int n = 11; // prints numbers from 1 to 10
        System.out.println("Printing numbers from 1 to " + n + ":");
        printNumbers(1, n);
    }

}
