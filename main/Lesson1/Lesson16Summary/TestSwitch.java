package org.telran.main.Lesson1.Lesson16Summary;

import org.telran.main.Lesson1.Lesson16Summary.holder.SwitchHolder;

import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(SwitchHolder.hold("Security"));
        System.out.println(SwitchHolder.hold("Password"));
        System.out.println(SwitchHolder.hold("User123"));
        System.out.println(SwitchHolder.hold("I`m write code"));
        System.out.println(SwitchHolder.hold("1970"));
        System.out.println(SwitchHolder.hold("1970"));
        System.out.println(SwitchHolder.hold("1970"));
        System.out.println(SwitchHolder.hold("1970"));
        System.out.println(SwitchHolder.hold("1970"));
        System.out.println(SwitchHolder.hold("1970"));
        System.out.println(SwitchHolder.hold("1970"));
        System.out.println(SwitchHolder.hold("1970"));

        System.out.println();

        System.out.println("Введите имя");
        String[] answer = SwitchHolder.checkName(scanner.nextLine());
        int index = 0;

        while (true) {
            if (index < answer.length) {
                System.out.println(answer[index]);
                index++;
            } else {
                break;
            }
        }

    }
}

