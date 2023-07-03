package org.telran.Lesson7;

import java.util.Random;

public class RandomStudent {
    public static void main(String[] args) {
        Random random = new Random();
        int numStudent = random.nextInt(25)+1;
        int numStudent2 = random.nextInt(25)+1;
        System.out.println("Student number: " + numStudent);

        System.out.println("Sum: " +sum(numStudent,numStudent2));
        System.out.println("Divide " +divide(numStudent,numStudent2));
//        System.out.println(numStudent2 / 0); //Error
    }
    static int sum(int num1, int num2) {
       int sumLocal = num1 + num2;
       return sumLocal;
    }
    static float divide(int num1, int num2) {
        float divideLocal = (float) num1 / num2;
        return divideLocal;
    }
    static void findEvenOdd(int arg) {
        if(arg%2==0) {
            System.out.println(arg+" четное");
        }
        else {
            System.out.println(arg+" нечетное");
        }
    }
}
