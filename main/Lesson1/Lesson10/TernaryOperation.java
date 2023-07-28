package org.telran.main.Lesson1.Lesson10;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
        int start1 , end1 , start2 , end2 , hour;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите какое сейчас время: ");
        hour = scanner.nextInt();
        start1 = 8;   start2 = 14;
        end1 = 17;    end2 = 22;
        if (hour > start1 && hour > end2) {
            if ( hour > start1 && hour > start2 ) {
                System.out.println("Два магазина открыты ");
            }
            System.out.println("Два магазина закрты ");
        }
    }
}
