package org.telran.lesson14Pavel;

import org.telran.lesson14Pavel.loop.Counter;

public class Main {
    public static void main(String[] args) {
        Counter firstCounter = new Counter("Привет, я первый ", "Bob");
        firstCounter.count(2);
        firstCounter.printName();

        System.out.println("------------------------------------");

        Counter seconCounter = new Counter("Привет, я второй ", "Dar");
        seconCounter.count(2);
        seconCounter.printName();

        System.out.println("------------------------------------");

        Counter anotherRemoteCounterOffFirstCounter = firstCounter;
        anotherRemoteCounterOffFirstCounter.count(2);
        anotherRemoteCounterOffFirstCounter.printName();

        System.out.println("------------------------------------");
        anotherRemoteCounterOffFirstCounter.name = "Name rename";
        firstCounter.printName();
    }
}
