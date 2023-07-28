package org.telran.main.Lesson1.Lesson13.game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

          runMenu();
        }
    static void runMenu() {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {

            System.out.println("Выберете за кого будете играть");
            System.out.println("");

            System.out.println("1. Elf");
            System.out.println("2. Ork");

            System.out.println("");
            System.out.println("Нажмите Q что бы выйти из игры");

            choice = scanner.next().charAt(0);
        if (choice != '1' && choice != '2' && choice != 'Q' ) {
            System.out.println("Вы сделали ошибку ");
        }
        } while (choice != '1' && choice != '2' && choice != 'Q' );
        choiceOk(choice);
    }
    static void choiceOk(char choice) {
        if (choice == '1' || choice == '2' || choice =='Q' ) {
            System.out.println((choice == '1' ? "Ваш выбор Elf" : "") + (choice == '2' ? "Ваш выбор Ork" : "") +
                    (choice == 'Q' ? "Выход из игры" : ""));
        }
    }
}
