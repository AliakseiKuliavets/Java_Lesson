package org.telran.main.Lesson1.lesson17.NewProgect.utils;


public class Utils {
    public static void sortArrays(int[] sortCras) {
        boolean isChange = true;
        int size = sortCras.length - 1;
        while (isChange) {
            isChange = false;
            for (int i = 0; i < size; i++) {
                if (sortCras[i].getModel().charAt(0) > sortCras[i+1].getModel().charAt(0)) {
                    isChange = true;
                    int temp = sortCras[i];
                    sortCras[i] = sortCras[i+1];
                    sortCras[i+1] = temp;
                }
            }
        }
    }
}
