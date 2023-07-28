package org.telran.main.Lesson1.Lesson9;

import java.util.Random;
import java.util.Scanner;

public class IfElseOperation {
    public static void main(String[] args) {
        Random random = new Random();
        float number = random.nextFloat() + random.nextInt(10);
        String num1 =String.format("%.3f" , number);
        System.out.println("Сгенерированное число: " + num1);


        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        System.out.println(isDarkLight(myString));

    }

    static String isDarkLight(String color) {
        if(color.equalsIgnoreCase("white") || color.equalsIgnoreCase("белый")) {
            System.out.println("светлый - " + color);
        } else if (color.equalsIgnoreCase("black") || color.equalsIgnoreCase("черный")){
            System.out.println("темный - " + color);
        } else if (color.equalsIgnoreCase("green") || color.equalsIgnoreCase("зеленый")){
            System.out.println("светлый - " + color);
        } else if (color.equalsIgnoreCase("brown") || color.equalsIgnoreCase("коричневый")) {
            System.out.println("темный - " + color);
        } else {
            System.out.println("Не можем определить");
        }
        return color;
    }
}
