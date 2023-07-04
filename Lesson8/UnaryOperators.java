package org.telran.Lesson8;

public class UnaryOperators {
    public static void main(String[] args) {
        int val1 = 10, val2 = 20;

        System.out.println("Summ val1 + val2: " + (val1 + val2));
        System.out.println("------------------------------------");

        val1++;
        System.out.println("Префиксный инкримент ++val1 " + val1);
        System.out.println("------------------------------------");

        System.out.println("Постфиксный инкримент val1++: " + (++val1));
        System.out.println("------------------------------------");

        val2--;
        System.out.println("Префиксный декрмент --val2 " + val2);

        System.out.println("------------------------------------");
        System.out.println("Постфиксный декрмент val2--: " + (--val2));

        // унарынй минус
        System.out.println("------------------------------------");
        System.out.println("Меняем val1 на противоположное было "+ val1 +" стало "+ (-val1) +" ");

        System.out.println("------------------------------------");
        System.out.println("Меняем val1" +
                " не меняется после написание ( -val1 ) \nбыло после изменения val1 " +
                ""+ -val1 +" стало "+ (-val1) +" ");

    }

}
