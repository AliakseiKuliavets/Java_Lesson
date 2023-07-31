package org.telran.main.Lesson1.lesson17.NewProgect.Car;

public class Car {
    private double price;
    private String model;

    public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }


    public static double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{ " +
                "price=" + price +
                ", model= '" + model + '\'' +
                '}';
    }
}
