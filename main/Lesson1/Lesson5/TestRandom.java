package org.telran.main.Lesson1.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {
    public static void main(String[] args) {
        int myInt = 5;
//        System.out.println(myInt);
//
//        Scanner scanner = new Scanner(System.in);
//        myInt = scanner.nextInt();
//        System.out.println(myInt);

        Random random = new Random();
        myInt = random.nextInt(50)+50;
//        System.out.println(myInt);

        double myDouble = random.nextDouble();
//        System.out.println(myDouble);

        System.out.println(myInt + myDouble);

    }
}
