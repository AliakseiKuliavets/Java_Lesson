package org.telran.lesson13Pavel;

public class Practice {
    public static void main(String[] args) {
        printHelloAndEvenNumbers(10);
    }
    public static void printHelloAndEvenNumbers(int numbers) {
        for (int i = 0; i < numbers; i++) {
            System.out.println("\"Hello my friend !\"");
        }
        System.out.println("---------------------");
        for (int i = 1; i <= numbers; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (long y = 0, z = 4; z < 10 || y < 10; z++, y++) {
            System.out.println(y + " ");
        }
    }
}
