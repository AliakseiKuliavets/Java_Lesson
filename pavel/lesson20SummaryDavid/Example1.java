
/*Create a function that takes 2 arguments. An array of integers and an integer. The function prints all pairs of
        numbers in this array that add up to this number (the second argument).*/


package org.telran.pavel.lesson20SummaryDavid;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] numsArrays = {30,70,20,90,10,80,40,60};
        arrays(numsArrays);
    }
    static void arrays(int[] numsArrays) {
        Arrays.sort(numsArrays);
        for (int i = 0; i < numsArrays.length; i++) {
           for (int j = i + 1 ; j < numsArrays.length; j++) {
               if (numsArrays[i] + numsArrays[j] == 100) {
                   System.out.println(numsArrays[i] + " + " +numsArrays[j] + " = " + "100");
               }
           }
        }
    }
}
