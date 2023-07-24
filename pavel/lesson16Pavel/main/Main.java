package org.telran.pavel.lesson16Pavel.main;

import org.telran.pavel.lesson16Pavel.task.Test;
import org.telran.pavel.lesson16Pavel.task.sub_task.SubTest;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.testCase);

        SubTest subTest = new SubTest();
        System.out.println(subTest.getHiddenField());

        subTest.setHiddenField("modified string with more than 15 characters");

        System.out.println(subTest.getHiddenField());
    }
}
