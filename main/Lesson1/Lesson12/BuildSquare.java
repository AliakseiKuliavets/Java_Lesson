package org.telran.main.Lesson1.Lesson12;

public class BuildSquare {
    public static void main(String[] args) {
        build(7,3);
    }
    static void build(int width, int height ) {
        for (int h = 0; h < height; h++){
            for ( int w = 0; w < width; w++){
                System.out.println("-");
            }
            System.out.println("|");
        }
    }
}
