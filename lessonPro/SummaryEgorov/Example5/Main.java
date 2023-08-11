package org.telran.lessonPro.SummaryEgorov.Example5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringlist = new ArrayList<>();
        stringlist.add("AA");
        stringlist.add("BB");
        stringlist.add("BB"); //
        stringlist.add("CC");



        System.out.println(new Main().findMaxRepeat(stringlist));
        System.out.println(new Main().findMaxRepeat2(stringlist));
    }

    /**
     * 1. Создадим массив интов для записи количсетва повторений эдемента в 
     * исходном листе
     * 2. Создадим переменную для нахождения максимального значения
     * 3. Создадим переменную для индекс максимального занчаения
     * 4. Протнциализируем массив "счетчиков"
     */

    public String findMaxRepeat(List<String> list) {
        int[] count = new int[list.size()];
        int max = Integer.MIN_VALUE;
        int indexMax = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count[i] += 1;
                }
            }
            if(max < count[i]) {
                max = count[i];
                indexMax = i;
            }

        }
        return list.get(indexMax);
    }

    public String findMaxRepeat2(List<String> list) {
        String maxString = "";
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count += 1;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxString = list.get(i);
            }
        }
        return maxString;
    }
}
