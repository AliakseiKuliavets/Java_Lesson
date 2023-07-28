package org.telran.main.Lesson1.Lesson2;

public class PracticeMain {
    static int myValueClass = 4;

    public static void main(String[] args) {
        int myInt2 = 3;
        our();
        System.out.println(myInt2);
        System.out.println(myValueClass);

        Test myTest = new Test();
        myTest.run();
        System.out.println(myTest.myIntTest + " какие то слова " + Test.myIntStatic);
        Test.myIntStatic = 999;
        Test myTest1 = new Test();
        myTest1.myIntTest = 88;
        System.out.println(myTest1.myIntTest + " какие то слова " + Test.myIntStatic);
        Test myTest2 = new Test();
        myTest2.myIntTest = 99;
        System.out.println(myTest2.myIntTest + " какие то слова " + Test.myIntStatic);
        System.out.println(myTest.myIntTest + " какие то слова " + Test.myIntStatic);

    }
    static void our() {
        int myInt = 1;
        System.out.println("Working = " + myInt);
        System.out.println(myValueClass - 2);
    }
}
