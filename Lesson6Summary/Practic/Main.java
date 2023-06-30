package org.telran.Lesson6Summary.Practic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Dog noneLessDog = new Dog();
        System.out.println(noneLessDog.name);
        System.out.println("-----------");
        Dog sharik = new Dog("Sharik");
        System.out.println(sharik.name);
        System.out.println("-----------");
        Dog sharik2 = new Dog("Zuk");
        System.out.println(sharik2.name);
        Dog ageDog = new Dog(23);
        System.out.println(ageDog.age);
        System.out.println("-----------");
        System.out.println("End");
    }
}
