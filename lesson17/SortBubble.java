package org.telran.main.Lesson1.lesson17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortBubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] newArrays = makeArrays(size);
        System.out.println(Arrays.toString(newArrays));

//        Arrays.sort(newArrays);
        sortArrays(newArrays);
        System.out.println(Arrays.toString(newArrays));

    }

    public static int[] makeArrays(int size) {
        int[] newArrays = new int[size];
        Random random = new Random();
        for (int i = 0; i < newArrays.length; i++) {
            newArrays[i] = random.nextInt(10);
        }
        return newArrays;
    }

    public static void sortArrays(int[] newArrays) {
        boolean isChange = true;
        while (isChange) {
            isChange = false;
            for (int i = 0; i < newArrays.length -1; i++) {
                if (newArrays[i] > newArrays[i+1]) {
                    isChange = true;
                    int temp = newArrays[i];
                    newArrays[i] = newArrays[i+1];
                    newArrays[i+1] = temp;
                }
            }
        }
    }
}
