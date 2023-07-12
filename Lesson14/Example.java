package org.telran.Lesson14;

public class Example {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.width=3;
//        box.length=10;
//        box.height =5;
//        System.out.println(box.calcVolume());

        Box box1 = new Box(5,4,3);
        System.out.println(box1.calcVolume());


    }
}

class Box {
    int width, height, length;

    public Box( int width, int height,int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    int calcVolume() {
        return width * height * length;
    }

    void create(int width, int height, int length) {
        System.out.println("Create a box of volume " + calcVolume());
    }
}
