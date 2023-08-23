package org.telran.lessonPro.lesson14.task4;

import org.telran.lessonPro.lesson14.task1.Degree;
import org.telran.lessonPro.lesson14.task1.Student;
import org.telran.lessonPro.lesson14.task1.StudentUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
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

        Predicate<Student> predicate = x -> x.getName().startsWith("A");
        StudentUtils.printFilteredStudents1(students,predicate);
    }
}
