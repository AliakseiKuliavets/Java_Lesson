package org.telran.main.Lesson1.Lesson15.practice;

public class TestArrObj {
    public static void main(String[] args) {
//        String[] arrStr = new String[3];
//        arrStr[0] = "Строка 1";
//        arrStr[2] = "Строка 3";
//        for (String i: arrStr) {
//            System.out.println(i);
//        }
//
//        System.out.println();
//
//        String[] arrStrLit = {"Строка 1","Строка 2","Строка 3"};
//        for (String i: arrStrLit) {
//            System.out.println(i);
//        }

        Pen[] pen = new Pen[3];
        pen[0] = new Pen();
        pen[0].setColor("blue");

        pen[1] = new Pen("red");
//        pen[1].setColor("red");

        Pen pen3 = new Pen("black");
        pen[2] = pen3;

        for (Pen val: pen) System.out.println(val);
//        System.out.println(pen[0].getColor());
//        System.out.println(pen[1].getColor());
//        System.out.println(pen[2].getColor());

        for (Pen val: pen) System.out.println(val.getColor());


        // c помощью литералов
        Pen[] penLiteral = {new Pen("Grey"),new Pen("Yellow"), new Pen("Green")};
        for (Pen val: penLiteral) System.out.println(val.getColor());

        
    }
}
