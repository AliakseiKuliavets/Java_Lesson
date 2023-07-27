package org.telran.pavel.lesson19Pavel.cars;

public class RidingCar extends Car implements Rideable{

    private final int maxSpeed;
    public RidingCar(double price, String model, int maxSpeed) {
        super(price, model);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void ride() {
        System.out.println("I`m driving on max speed " + maxSpeed);
    }
}
