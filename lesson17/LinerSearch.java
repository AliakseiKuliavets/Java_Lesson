package org.telran.main.Lesson1.lesson17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] newArrays = makeArrays(size);
        System.out.println(Arrays.toString(newArrays));

        System.out.print("Введите элемент для поиска в массиве c помощью searchIndex: ");
        int index1 = scanner.nextInt();
        System.out.println(searchIndex(newArrays,index1));


        System.out.print("Введите элемент для поиска в массиве c помощью searchAll: ");
        int index2 = scanner.nextInt();
        System.out.println(Arrays.toString(searchAll(newArrays,index2)));


    }
    public static int[] makeArrays(int size) {
        int[] newArrays = new int[size];
        Random random = new Random();
        for (int i = 0; i < newArrays.length; i++) {
            newArrays[i] = random.nextInt(10);
        }
        return newArrays;
    }

    public static int searchIndex(int[] newArrays, int key) {
        for ( int i = 0 ; i < newArrays.length; i++) {
            if(newArrays[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int[] searchAll(int[] newArrays, int key) {
        int[] findInd = null;
        for (int i =  newArrays.length - 1; i >= 0; i--) {
            if (newArrays[i] == key) {
                if (findInd == null) {
                    findInd = new int[1];
                    findInd[0] = i;
                } else {
                    findInd = Arrays.copyOf(findInd,findInd.length+1);
                    findInd[findInd.length-1] = i;
                }
            }
        }
        return findInd;
    }

}
