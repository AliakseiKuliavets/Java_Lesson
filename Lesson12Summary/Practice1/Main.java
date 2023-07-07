package org.telran.Lesson12Summary.Practice1;

public class Main {
    public static void main(String[] args) {
//        int num1 = 15;
//        int num2 = 21;
//        System.out.println(Practice.sum(num1,num2));
//        Practice.positiveSumTest();
        int result = Practice.sum(15,21);
        int expected = 26;
        Practice.assertEqualsTest(result, expected);
    }

}
