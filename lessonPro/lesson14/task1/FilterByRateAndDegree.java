package org.telran.lessonPro.lesson14.task1;

public class FilterByRateAndDegree implements Filter{

    @Override
    public boolean test(Student student) {
        return student.getAverageRate() > 4 && student.getDegree().equals(Degree.MASTER);
    }
}
