
package org.telran.main.Lesson1.lesson15New;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму на счету: ");
        int balance = scanner.nextInt();

        int day = 0;
        while (balance > 0) {
            int witDraw = balanceTwo(balance);
            balance = balance - witDraw;
            day++;
        }
        System.out.println("Вам потребуется " + day + " дней, чтобы забрать все свои деньги со счета.");
    }

    private static int balanceTwo(int balance) {
        int maxWith = 1;
        for (int i = balance / 2; i > 1; i--) {
            if (balance % i == 0) {
                maxWith = i;
                break;
            }
        }
        return maxWith;
    }
}
