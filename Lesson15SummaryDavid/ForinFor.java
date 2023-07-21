// Найти простые числа от 1 до 20
// 1, 2, 3, 5, 7 , 11 , 13, 17, 19

package org.telran.Lesson15SummaryDavid;

public class ForinFor {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (simple(i)) {
                System.out.println(i);

            }
        }
    }
    private static boolean simple(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
