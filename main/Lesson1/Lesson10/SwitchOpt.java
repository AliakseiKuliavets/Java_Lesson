package org.telran.main.Lesson1.Lesson10;

import java.util.Scanner;

public class SwitchOpt {
    public static void main(String[] args) {
        System.out.println("Введите день недели: ");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        System.out.println("Введите день недели: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(getNameOfWeek(num1));
        System.out.println(getNameSwitch(num));


    }
    static String getNameOfWeek(int num) {
        if ( num <= 0 || num > 7) {
            System.out.println("Некоретное входящее число");
            return "Должно быть от 1 до 7";
        }
        String nameDayOfWeek = "";
        if (num == 1) nameDayOfWeek = "Понедельник ";
        else if (num == 2) nameDayOfWeek = "Вторник ";
        else if (num == 3) nameDayOfWeek = "Среда ";
        else if (num == 4) nameDayOfWeek = "Четверг ";
        else if (num == 5) nameDayOfWeek = "Пятница ";
        else if (num == 6) nameDayOfWeek = "Суббота ";
        else if (num == 7)nameDayOfWeek = "Воскресенье ";
        else nameDayOfWeek = "try again";
        return nameDayOfWeek;
    }

    static String getNameSwitch(int num1) {
        String nameDayOfWeek = "";
        switch (num1) {
            case 1:
                nameDayOfWeek = "Понедельник ";
                break;
            case 2:
                nameDayOfWeek = "Вторник ";
                break;
            case 3:
                nameDayOfWeek = "Среда ";
                break;
            case 4:
                nameDayOfWeek = "Четверг ";
                break;
            case 5:
                nameDayOfWeek = "Пятница ";
                break;
            case 6:
                nameDayOfWeek = "Суббота ";
                break;
            case 7:
                nameDayOfWeek = "Воскресенье ";
                break;
            default:
                nameDayOfWeek = "Не коректное число должно быть от 1 до 7";
        }
        return nameDayOfWeek;
    }
}
