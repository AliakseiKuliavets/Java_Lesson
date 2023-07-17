package org.telran.lesson11Pavel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program start");
        System.out.println("------------------------");
        returnExample();
        System.out.println("------------------------");
        System.out.println("Program end");
    }
    public static void returnExample() {
        boolean t = true;
        System.out.println("Before the return instruction");

        if (t) {
            return;
        }
        else {
            System.out.println("This one execute");
        }

        System.out.println("This one execute");
    }
}
