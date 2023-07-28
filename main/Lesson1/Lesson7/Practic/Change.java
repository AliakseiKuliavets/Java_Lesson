package org.telran.main.Lesson1.Lesson7.Practic;

public class Change {
    public static void main(String[] args) {
       changeAB(10,25);
        changeNo(11, 26);
    }
    static void changeAB(int a, int b) {
        System.out.println("arg1 = " + a + " arg2 = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("arg1 = " + a + " arg2 = " + b);
    }
    static void changeNo(int a, int b) {
        System.out.println("arg1 = " + a + " arg2 = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("arg1 = " + a + " arg2 = " + b);
    }

}
