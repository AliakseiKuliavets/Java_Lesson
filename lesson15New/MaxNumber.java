package org.telran.lesson15New;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++){
            if (i % 2 == 0) {
                System.out.println("Чётное число: " + i);
            } else {
                System.out.println("Нечетное число: " + i);
            }
        }

        System.out.println("------------");

        int j = 1;
        while (j <= 10) {
            if (j % 2 == 0) {
                System.out.println("Чётное число: " + j);
            } else {
                System.out.println("Нечетное число: " + j);
            }
            j++;

        }
    }
}
