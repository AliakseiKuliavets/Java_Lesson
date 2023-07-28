/*
№2
Реализовать программу, выводящую на экран результаты:
Сложения двух чисел
Вычитания двух чисел
Умножения двух чисел
Деления двух чисел
Каждая из арифметических операций должна быть реализована как отдельный метод.
*/

package org.telran.main.Lesson1.Lesson2;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        int myInt;
        Scanner myScanner = new Scanner(System.in);


        // integer
        System.out.print("Write first number");
        myInt = myScanner.nextInt();
        System.out.println("Our number is: " + myInt);

        System.out.println();
        // boolean
        System.out.print("true or false");
        boolean myBool = myScanner.nextBoolean();
        System.out.println("it`s: " + myBool);

        System.out.println();
        // String
        Scanner myScannerString = new Scanner(System.in);
        System.out.println("Write text");
        String myString = myScannerString.nextLine();
        System.out.print("Yor text: " + myString);

        System.out.println();
        // long
        System.out.print("Long number");
        long myLong = myScanner.nextLong();
        System.out.println("Number i`ts: " + myLong);

        System.out.println();
        // float
        System.out.print("Float number");
        float myFloat = myScanner.nextFloat();
        System.out.println("Number i`ts: " + myFloat);

    }
}
