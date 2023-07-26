package org.telran.pavel.lesson18Pavel.CarsArrays.utils;

import org.telran.pavel.lesson18Pavel.CarsArrays.cars.Car;

public class Sorter {
    public static void sortCars(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {

                double currentCarPrice = cars[j].getPrice();
                double nextCarPrice = cars[j + 1].getPrice();

                if (currentCarPrice > nextCarPrice) {
                    Car temp = cars[j + 1];
                    cars[j + 1] = cars[j];
                    cars[j] = temp;
                }
            }

        }
    }
}
