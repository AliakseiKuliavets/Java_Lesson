package org.telran.Lesson13.practice2;

public class SumDoWhile {
    public static void main(String[] args) {
        sumX();
    }
    static void sumX() {
        int x = 10;
        int sum = 0;
        do {
            sum += x;
            x--;
        } while (x > 0);
            System.out.println(sum);
    }
}
