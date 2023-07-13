package org.telran.Lesson15;

import java.util.Arrays;
import java.util.Random;

public class TestArrays {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        Random random = new Random();
        for (int val = 0 ; val < arrays.length; val++)
            arrays[val] = random.nextInt(20);
        for (int val: arrays) System.out.println(val);

        // ручное увеличение с помощью метода
        arrays = copyArray(arrays, 15);
        for (int val: arrays) System.out.println(val);

        // увелечиение Arrays с библиотеки
        arrays = Arrays.copyOf(arrays,20);
        for (int val: arrays) System.out.println(val);

        // коипрование массива
        int[] newArrays = Arrays.copyOf(arrays, arrays.length);

//        String[] arrString = new String[5];
//        for (String val: arrString) System.out.println(val);
//
//
//        int[] arrNew  = {1,2,3,4,5,6};
//        for (int val: arrNew) System.out.println(val);
//


    }
    private static int[] copyArray(int[] oldArr, int newSize) {
        if (oldArr.length > newSize) return null;

        int[] newArr = new int[newSize];
        for (int i = 0; i < oldArr.length; i++) newArr[i] = oldArr[i];
        return newArr;
    }
}
