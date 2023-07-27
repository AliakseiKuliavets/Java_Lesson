package org.telran.pavel.lesson19Pavel.cars;

public class Car implements Comparable<Car> {


    private final double price;
    private final String model;

    public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        return "Car - " + this.model + ", price = " + this.price;
    }

    @Override
    public int compareTo(Car car) {
        if (this.price > car.price) {
            return 1;
        } else if (this.price < car.price) {
            return -1;
        } else {
            return 0;
        }
    }
}
