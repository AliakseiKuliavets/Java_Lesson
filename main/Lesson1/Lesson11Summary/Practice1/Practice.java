package org.telran.main.Lesson1.Lesson11Summary.Practice1;

public class Practice {
    public static int sum(int num1, int num2) {
        return num1+num2;
    }
    public static void assertEqualsTest(int currentNumber, int expectedNumber) {
        if (currentNumber == expectedNumber) System.out.println("Test work");
        else {
            System.err.println("Test error \n");
            System.out.println();
            System.err.println("Current: " + currentNumber);
            System.err.println("Expected: " + expectedNumber);
        }
    }
}
