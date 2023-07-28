package org.telran.main.Lesson1.Lesson12;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        printWorld(4);
        Scanner scanner = new Scanner(System.in);
        digit(scanner.nextInt());
        digitInfinity(scanner.nextInt());
        digitInfFor(2345,4);
    }

    static void digit(int number){
        for (;;) {
            System.out.println(number % 10);
            number = number/ 10;
            if (number == 0) break;
        }
    }

    static void digitInfFor(int number, int count){
        for (int i = 0; i <count; i++) {
            System.out.println(number % 10);
            number = number/ 10;
        }
    }

    static void digitInfinity(int number){
        for (int i =0; i >=0; i++) {
            System.out.println(number % 10);
            number = number/ 10;
            if (number == 0) break;
        }
    }
    static void printWorld(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello world");
        }
    }
}
