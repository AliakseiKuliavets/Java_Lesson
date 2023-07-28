package org.telran.main.Lesson1.Lesson5;

public class OurMethods {
    public static void main(String[] args) {
        sum(1,2);

        int sum = sumReturn(12,3);
        System.out.println(sum);
    }


    static void sum(int num1, int num2) { // метод который не возвращает результат и нельзя будет использовать в дальнейшем
        int sum = num1+num2;
        System.out.println("Сумма равна: " + sum);
    }

    static int sumReturn(int num1, int num2) { // метод который вызывает результат пишем обязательно static int т()
        int sum = num1+num2;
        return sum; // возвращаем и работаем с полученной суммой
    }
}

