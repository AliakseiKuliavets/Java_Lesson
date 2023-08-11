package org.telran.lessonPro.SummaryEgorov.Example3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,123,14,16,17,9);
        System.out.println(new Main().getOdd(list));
    }
    public List<Integer> getOdd (List<Integer> list) {
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                oddList.add(list.get(i));
            }
        }
        return oddList;
    }
}
