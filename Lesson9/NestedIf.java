package org.telran.Lesson9;

import java.util.Random;

public class NestedIf {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(200);
        System.out.println("Сгенерированное число " + number);

//        if(number > 100) {
//            System.out.println("Человек нарушил правила!");
//            if (number > 120) {
//                System.out.println("Человек значительно нарушил, выписать штраф!");
//                if (number > 150) {
//                    System.out.println("Человек очень серьезно нарушил, и получил удвоенный штраф");
//                    if (number > 180) {
//                        System.out.println("Лишение прав ");
//                    }
//                }
//            }
//        }



        int num1 = 0;
        int num2 = 2;
        if ( num1 == 0 || num2 == 0 ) {
            System.out.println((num1 == 0 ? "num1 " + num1 : "") + (num2 == 0 ? "num2 " + num2 : ""));
        }
    }

}
