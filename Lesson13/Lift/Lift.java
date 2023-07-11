package org.telran.Lesson13.Lift;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        int H,N,M;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сколько этажей ");
        H = scanner.nextInt();
        System.out.print("Шаг подьема ");
        N = scanner.nextInt();
        System.out.print("Шаг спуска ");
        M = scanner.nextInt();


        ifElse(H,N,M);


    }

    static void  ifElse(int H, int N, int M) {
        if (N < M) {
            System.out.println("Error вы можете только подниматься");
        } else if (N == M){
            System.out.println("Хочешь остаться спать в лифте");
        } else {
            currenFlor(H, N, M);
        }
    }
    static int numberOfLifts(int floor, int stepUp, int stepDown) {
        return floor + stepUp - stepDown;
    }
    static void currenFlor(int H, int N, int M) {
        int currentFloor = 0;
        while (currentFloor < H) {
            System.out.println("Текущий этаж " + currentFloor);
            currentFloor = numberOfLifts(currentFloor, N, M);
        }
    }
}
