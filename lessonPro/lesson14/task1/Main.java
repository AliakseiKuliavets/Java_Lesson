package org.telran.lessonPro.lesson14.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Bogdan", 21,3, 4.8, Degree.MASTER));
        students.add(new Student("Sergey", 21,2, 3.8, Degree.BACHELOR));
        students.add(new Student("Ivan", 20,2, 4.5, Degree.MASTER));
        students.add(new Student("Olga", 23,4, 4.2, Degree.BACHELOR));
        students.add(new Student("Aliaksei", 22,3, 4.9, Degree.MASTER));
        students.add(new Student("Yulia", 24,4, 4.2, Degree.BACHELOR));
        students.add(new Student("Kirill", 18,1, 5.0, Degree.MASTER));
        students.add(new Student("Aleksander", 19,1, 3.9, Degree.BACHELOR));

        System.out.println("Список сутдентов");
        for (Student student: students) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("Средний бал больше 4, степень магистр");
        StudentUtils.printFilteredStudents(students, new FilterByRateAndDegree());

        System.out.println("Возраст < 25, степень ,стпень бакалавр");
        StudentUtils.printFilteredStudents(students, new FilterByAgeAndDegree());

        System.out.println("Имя начинается на А и средний бал больше 4.5");
        System.out.println("Использумем анонимный класс");
        StudentUtils.printFilteredStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().startsWith("A") && student.getAverageRate() < 4.5;
            }
        });

        System.out.println("Курс до 2 включительно и средний бал больше 4.0");
        System.out.println("Использумем анонимный класс");
        StudentUtils.printFilteredStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCurse() <= 2 && student.getAverageRate() > 4.0;
            }
        });

        System.out.println("Длинна имени 6 или больше , содержит а");
        System.out.println("Используем лямбда выражения");
        StudentUtils.printFilteredStudents(students,
                x -> x.getName().length() >= 6 && x.getName().toLowerCase().contains("a"));


        System.out.println("Курс нечетный  , возвраст четный");
        System.out.println("Используем лямбда выражения");
        StudentUtils.printFilteredStudents(students,
                x -> (x.getCurse()%2!= 0) && (x.getAge()%2==0));


        System.out.println("Имя с содержанием i , степень бакалавр");
        System.out.println("Используем лямбда выражения");
        Filter filter = x -> x.getDegree().equals(Degree.BACHELOR) && x.getName().toLowerCase().contains("i");
        StudentUtils.printFilteredStudents(students,filter);


    }
}
