package org.telran.Lesson6Summary;

public class Main {
    public static void main(String[] args) {
       NotMain notMain = new NotMain();
        System.out.println(notMain.size1);
        increaseSize(notMain);
        System.out.println(notMain.size1);

        NotMain secondnextName = new NotMain();

        increaseSize(secondnextName);
        increaseSize(secondnextName);

        System.out.println(notMain.size1);
        System.out.println(secondnextName.size1);
    }
    private static void increaseSize(NotMain innerNotMain) {
        innerNotMain.size1 = innerNotMain.size1 + 1;
        innerNotMain.size1++;
    }
}
