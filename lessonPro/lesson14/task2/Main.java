package org.telran.lessonPro.lesson14.task2;

public class Main {
    public static void main(String[] args) {
        Operation operation = (x, y) -> {
            int result = x + y;
            System.out.println("Work");
            return result;
        };

        System.out.println(operation.operate(3,5));
        System.out.println(operation.operate(10,20));
    }
}
