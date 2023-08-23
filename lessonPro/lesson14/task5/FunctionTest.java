package org.telran.lessonPro.lesson14.task5;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer, Double> function = x -> x / 2.0;

        System.out.println(function.apply(10));
        System.out.println(function.apply(9));
    }
}
