package org.telran.main.Lesson1.Lesson4;

public class Test {

//    static int myIntStatic = 4;
    public int myIntTest;

    public Test() {
        System.out.println("I`m in Test Constructor Test()");
        myIntTest = 1;
    }

//    public Test(int myInt) {
//        System.out.println("I`m in Test Constructor myInt()");
//        myIntTest = myInt;
//    }

    public Test(int myIntTest) {
        System.out.println("I`m in Test Constructor myInt()");
        this.myIntTest = myIntTest;
    }

    public void run() {
        myIntTest = myIntTest + 2;
        this.myIntTest = this.myIntTest + 2;
        System.out.println("I`m in run()" + myIntTest);
    }
}
