/*Создайте 5 объектов типа Car
        Сохраните объекты в массив
                Объект Car должен содержать поля
                    private double price;
                    private String model;
                    и конструктор с этими полями
        Распечатайте результат
            Результат печати одного авто должен выглядеть
        Применив метод “сортировка пузырьком” отсортируйте массив по стоимости
        Распечатайте результат
        Применив метод “сортировка пузырьком” отсортируйте массив по модели (первая буква из модели)
        Распечатайте результат*/



package org.telran.pavel.lesson18Pavel.CarsArrays;

import org.telran.pavel.lesson18Pavel.CarsArrays.cars.Car;
import org.telran.pavel.lesson18Pavel.CarsArrays.utils.Sorter;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        cars[0] = new Car(2.3, "BMW");
        cars[1] = new Car(5.1, "Volvo");
        cars[2] = new Car(1.8, "Mercedes");
        cars[3] = new Car(0.5, "Toyota");
        cars[4] = new Car(7.2, "Audi");

        Sorter.sortCars(cars);
        for (Car car: cars) {
            System.out.println(car);
        }
    }
}
