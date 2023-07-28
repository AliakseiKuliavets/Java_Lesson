package org.telran.main.Lesson1.Lesson7.Practic;

public class RandomMath {
    public static void main(String[] args) {
        System.out.println(setStudentValue(25));
    }
    static int setStudentValue(int studentValue) {
        int max = studentValue;
        int min = 2;
        int random = (int) (min + Math.random() * ((max - min) + 1));
        return random;
    }
}
