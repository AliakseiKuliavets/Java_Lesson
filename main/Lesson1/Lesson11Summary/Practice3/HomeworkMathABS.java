package org.telran.main.Lesson1.Lesson11Summary.Practice3;

public class HomeworkMathABS {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int a = 10;
        double b = Math.abs(a - num1);
        double c = Math.abs(a - num2);
        if (b > c) {
            System.out.println(num2);
        }
        if (b < c) {
            System.out.println(num1);
        }
    }
}
