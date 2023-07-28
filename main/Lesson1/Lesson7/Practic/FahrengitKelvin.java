package org.telran.main.Lesson1.Lesson7.Practic;

import java.util.Scanner;

public class FahrengitKelvin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите во что хотите перевести:" +
                " \n 1. Fahrengeit -> Kelvin \n 2. Kelvin -> Fahrengeit");
        int choice = sc.nextInt();
        System.out.println("Укажите число");
        int number = sc.nextInt();
        if (choice == 1) {
            System.out.println("Kelvin = " + fafrengitKelvin(number));
        } else {
            System.out.println("Fahrengeit = " + kelvinFafrengit(number));
        }
    }
    static float fafrengitKelvin(int number) {
        float num = (float) ((number - 32) * 5/9 + 273.15);
        return num;
    }
    static float kelvinFafrengit(int number) {
        float num = (float) ((number - 273.15) * 9/5 + 32);
        return num;
    }
}
