package org.telran.Lesson9;

import java.util.Random;

public class ChoiceIf {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(51) - 25;
            System.out.println("Число до проверки: " + number);

        if (number > 0) {
            number++;
        }
        System.out.println("Число после проверки: " +number);

        if (number == 0) {
            --number;
            System.out.println("Если равно 0 то будет инкримент числа " + number);
        }

        if (number < 0) {
            return;
        }

        System.out.println("Заново преобразуем его и " + (number-273));
    }
}
