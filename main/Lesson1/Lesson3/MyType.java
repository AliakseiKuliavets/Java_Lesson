package org.telran.main.Lesson1.Lesson3;

public class MyType {
    public static void main(String[] args) {
        byte myByte = 120;
        int myInt = myByte;
        System.out.println(myInt);


        long myLong = 390;
        myByte =  (byte)myLong;
        System.out.println(myByte);
    }
}
