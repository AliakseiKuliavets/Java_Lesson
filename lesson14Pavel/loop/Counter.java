package org.telran.lesson14Pavel.loop;

public class Counter {
    private final String title;
    public String name;

    public Counter(String title, String name) {
        this.title = title;
        this.name = name;
    }
    public  void count(int upperLimitNumber) {
        int current = 0;

        while (current <= upperLimitNumber) {

            System.out.println(title + " " +current );

            current++;

        }
    }
    public void printName() {
        System.out.println(name);
    }
}
