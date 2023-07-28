package org.telran.main.Lesson1.Lesson4;

public class TestConstructor {
    public static void main(String[] args) {
//        int myInt;
//        myInt = 15;

        Test test;
        test = new Test();
        System.out.println(test.myIntTest);

        Test test2;
        test2 = new Test(1);
        System.out.println(test2.myIntTest);




//        test.run();
      /*  outString("I`m from output in main");
        String myStr = "Mama washing windows";
        outString(myStr);
        int inInt;
        inInt = 10;
        outTwoValue(myStr, inInt);*/

    }
    // это метод
    /*static void outString(String inStr){
        String localStr = inStr.toUpperCase();
        System.out.println("Hello im from Metod. \n" + inStr);
        System.out.println(" ");
        System.out.println("Hello im from Metod. And im Upper \n" + localStr);
        System.out.println(" ");
    }


    static void outTwoValue(String inStr, int inInt){
        String localStr = inStr.toUpperCase();
        System.out.println("Hello im from Metod. \n" + inStr);
        System.out.println(" ");
        System.out.println("Hello im from Metod. Number. \n" + inInt);
        System.out.println(" ");
        System.out.println("Hello im from Metod. And im Upper \n" + localStr);
        System.out.println(" ");
    }*/
}
