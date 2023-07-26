package org.telran.pavel.lesson18Pavel.CarsArrays.cars;

public class Car {
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
}
