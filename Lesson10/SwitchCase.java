package org.telran.Lesson10;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Print day from 1 to 7: ");
        int num = scanner.nextInt();
        getWorkDay(num);

    }
    static void getWorkDay(int num) {
        switch (num) {
            case 1, 2, 3, 4, 5 :
                System.out.println("It`s work day");
                break;
            case 6, 7:
                System.out.println("It`s weekend day");
                break;
            default:
                System.out.println("Try again");

        }
    }
}
