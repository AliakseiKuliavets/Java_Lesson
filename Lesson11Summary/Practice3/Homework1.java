package org.telran.Lesson11Summary.Practice3;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String firstWord = scanner.nextLine();
        System.out.println("Введите второе слово");
        String secondWorld = scanner.nextLine();

        if (firstWord.length()% 2 != 0 || secondWorld.length() % 2 != 0){
                System.out.println((firstWord.length()% 2 != 0  ? "Первое слово не четное " + firstWord : "")
                        + (secondWorld.length() % 2 != 0 ? "\nВторое слово не четное " + secondWorld : ""));
        } else {
            System.out.println(catWordInHaf(firstWord, secondWorld));
        }
    }
    public static String catWordInHaf(String firstWord, String secondWorld){
        String hafFirsWord1 = firstWord.substring(0,firstWord.length()/2);
        String hafSecondWorld1 = secondWorld.substring(0,secondWorld.length()/2);
        return hafFirsWord1+hafSecondWorld1;

    }
}
