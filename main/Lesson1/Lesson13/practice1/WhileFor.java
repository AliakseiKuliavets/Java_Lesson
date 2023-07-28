package org.telran.main.Lesson1.Lesson13.practice1;

public class WhileFor {
    public static void main(String[] args) {
        runHelloFor();
        System.out.println("");
        runHelloWhile();
        System.out.println("");
        runWhileInfin();
        System.out.println("");
        runWhileDo();
    }
    static void runHelloFor() {
        for(int i=0; i < 10; i++) {
            System.out.println("Hello World = FOR");
        }
    }

    static void runHelloWhile() {
        int i = 10;
        while (i > 0){
            System.out.println("Hello World = WHILE");
            i--;
        }
    }
    static void runWhileInfin() {
        int i = 10;
        while (true) {
            System.out.println("Hello World = WHILE INFINITY");
            i--;
            if (i < 1) {
                break;
            }
        }
    }

    static void runWhileDo() {
        int i = 10;
        do {
            System.out.println("Hello World = WHILE DO");
            i--;
        } while (i > 0);
    }
}
