package org.telran.pavel.lesson16Pavel.object_example;

public class Main {
    public static void main(String[] args) {
        Water water = new Water(20,"жидкая ", false);
        System.out.println("Water temperature: " + water.getTemperature());
        water.setTemperature(150);
        System.out.println("Water temperature: " + water.getTemperature());
        System.out.println("Water condition: " + water.getCondition());
        System.out.println("Water salt: " + water.getSalt());
    }
}
