package org.telran.pavel.lesson11Pavel;

public class Example {
    public static void main(String[] args) {
        int num1 = 10;
        comparNum(num1);
    }
    static void comparNum(int num1) {
        if (num1 == 15) {
            System.out.println("Я " + num1 + " == "  + 15);
        } else if (num1 < 15) {
            System.out.println("Я " + num1 + " < "  + 15);
        } else  {
            System.out.println("Я " + num1 + " > "  + 15);
        }
    }
}
