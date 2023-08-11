package org.telran.lessonPro.SummaryEgorov.Example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,23,9,1,7,8);
        System.out.println(new Main().getSum(list));
    }
    public int getSum(List<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
           result += list.get(i);
        }
        return result;
    }
}
