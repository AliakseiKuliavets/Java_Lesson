package org.telran.main.Lesson1.lesson17.NewProgect;

import jdk.jshell.execution.Util;
import org.telran.main.Lesson1.lesson17.NewProgect.Car.Car;
import org.telran.main.Lesson1.lesson17.NewProgect.utils.Utils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                        new Car (30_000, "BMW") ,
                        new Car(25_000, "Volkswagen"),
                        new Car(50_000, "Tesla"),
                        new Car(15_000, "Nissan")};
        for (Car car: cars) {
            System.out.println(car);
        }
        Utils.sortArrays(cars);

    }
}
