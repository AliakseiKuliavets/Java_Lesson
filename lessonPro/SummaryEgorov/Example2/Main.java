package org.telran.lessonPro.SummaryEgorov.Example2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(-1, "AAA");
        map.put(0, "BBB");
        map.put(-8, "CCC");
        map.put(10, "DDD");
        map.put(5, "FFF");
        map.put(2, "EEE");
        System.out.println(new Main().getKey(map));
    }
    public int getKey(Map<Integer, String> map) {
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            int key = pair.getKey();
            if (max < key) {
                max = key;
            }
        }return max;
    }
}
