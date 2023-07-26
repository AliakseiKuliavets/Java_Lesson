package org.telran.pavel.lesson18Pavel.arrays_class_example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"first", "second", "third", "fourth", "fifth"};

        String[] copyString = Arrays.copyOf(strings, 3);

        for (String eachString : copyString) {
            System.out.println(eachString);
        }

        System.out.println(Arrays.toString(copyString));

        String[] copyOfRangeStrings = Arrays.copyOfRange(strings, 2, 4);

        System.out.println(Arrays.toString(copyOfRangeStrings));
    }
}
