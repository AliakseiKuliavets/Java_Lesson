package org.telran.lessonPro.SummaryEgorov.Example4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(3); //
        list.add(4);
        list.add(4);
        list.add(5); //
        list.add(6);
        list.add(6);
        list.add(7);
        list.add(9); //
        list.add(7);

        System.out.println(new Main().removeDublicate(list));
    }

    public List<Integer> removeDublicate(List<Integer> list) {
        for (int i = 0; i < list.size() - 1 ; i++) {
            for (int j = 0; j < i + 1 ; j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(i);
                }
            }
        }
        return list;
    }
}
