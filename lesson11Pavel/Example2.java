package org.telran.lesson11Pavel;

public class Example2 {
    public static void main(String[] args) {
        int num1 = 20;

//        if (num1 < 10) {
//            System.out.println("num1 < 10");
//        }
//
//        if (num1 < 25) {
//            System.out.println("num1 < 25");
//        }
//
//        if (num1 < 30) {
//            System.out.println("num1 < 30");
//        }

//        else {
//            System.out.println("It`s not working");
//        }

        if (num1 < 10) {
            System.out.println("num1 < 10");
        } else if (num1 < 30) {
            System.out.println("num1 < 30");
            if (num1 < 25) {
                System.out.println("num1 < 25");
                if (num1 == 20) {
                    System.out.println("num1 == 20");
                }
            }
        }
    }
}
