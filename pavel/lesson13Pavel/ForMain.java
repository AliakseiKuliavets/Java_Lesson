package org.telran.pavel.lesson13Pavel;

public class ForMain {
    public static void main(String[] args) {
        forExample(16);
    }
    public static void forExample(int inputNumber) {
       for (int i = inputNumber ; i > 0 ; i-- ) {       // i-- or i = i - 1
           System.out.println(i);
       }
    }
}
