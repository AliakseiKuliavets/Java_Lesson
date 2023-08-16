package org.telran.lessonPro.lesson12.treesBinaryTrees.task1;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> items = new TreeMap<>();

        items.put("Orange", 5);
        items.put("Tomato", 4);
        items.put("Banana", 6);
        items.put("Apple", 2);
        items.put("Watermelon", 1);
        items.put("Lemon", 7);

        for (Map.Entry<String, Integer> item : items.entrySet()) {
            String key = item.getKey();
            Integer value = item.getValue();
            System.out.printf("Товар - %s, цена - %d.%n", key, value);
        }

        TreeMap<Cat, Integer> cats = new TreeMap<>();

        cats.put(new Cat(5, "Black", 3.2), 1);
        cats.put(new Cat(3, "Green", 4), 2);
        cats.put(new Cat(2, "Brown", 2.2), 3);
        cats.put(new Cat(1, "White", 1.3), 4);
        cats.put(new Cat(5, "Grey", 2.9), 5);

        for (Map.Entry<Cat, Integer> pair : cats.entrySet()) {
            Cat cat = pair.getKey();
            Integer id = pair.getValue();
            System.out.println(cat + " " + id);
        }

    }
}
