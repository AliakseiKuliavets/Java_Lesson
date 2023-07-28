package org.telran.pavel.lesson20SummaryDavid;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
                System.out.println(Arrays.toString(array));
        }
    }
}
