package org.telran.main.Lesson1.Lesson9;

import java.util.Random;

public class IfElse {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(51) - 25;
        System.out.println("Число до проверки: " + number);

        if (number > 0) {
            System.out.println("Температура в Цельсиях: " + number);
        } else {
            System.out.println("Увеличим температуру на 5 градусов: " + (number + 5));
        }

        System.out.println((number > 0) != (!(number > 0)));


    }
}
