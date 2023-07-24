package org.telran.pavel.lesson16Pavel.object_example;

public class Water {
    private int temperature;
    private String condition;
    private boolean salt;

    public Water(int temperature, String condition, boolean salt) {
        this.temperature = temperature;
        this.condition = condition;
        this.salt = salt;
    }





    public void setTemperature(int temperature) {
        if (temperature >= -100 && temperature <= 100) {
            this.temperature = temperature;
        } else {
            System.out.println("Не валидная температура");
        }
    }

    public int getTemperature() {
        return temperature;
    }
    public void setCondition(String condition) {
        if (condition.equals("жидкая") || condition.equals("твёрдая") || condition.equals("газообразное") )
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setSalt(boolean salt) {
        this.salt = salt;
    }
    public boolean getSalt() {
        return salt;
    }

}
