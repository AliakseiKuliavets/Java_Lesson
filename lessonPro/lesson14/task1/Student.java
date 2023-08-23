package org.telran.lessonPro.lesson14.task1;

import java.util.Objects;

public class Student {
    private  String name;
    private int age;
    private int curse;
    private double averageRate;
    private Degree degree;

    public Student(String name, int age, int curse, double averageRate, Degree degree) {
        this.name = name;
        this.age = age;
        this.curse = curse;
        this.averageRate = averageRate;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCurse() {
        return curse;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public Degree getDegree() {
        return degree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && curse == student.curse && Double.compare(student.averageRate, averageRate) == 0 && Objects.equals(name, student.name) && degree == student.degree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, curse, averageRate, degree);
    }

    @Override
    public String toString() {
        return String.format("Cтудент: имя - %s, возраст - %d, курс - %d, степень - %s, средний бал - %.2f",
                name , age , curse , degree.getDescription(), averageRate);
    }
}
