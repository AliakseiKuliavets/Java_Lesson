package org.telran.main.Lesson1.Lesson16Summary.holder;

public class SwitchHolder {

//    private static String owner = "Andrei";
    private static String[] saver = new String[10];
    private static int index = 0;

    public static boolean hold(String password) {
        if (index > (saver.length - 1)) {
            return false;
        } else {
            saver[index] = password;
            index++;
            return true;
        }
    }
    public static String[] checkName(String inputName) {
        switch (inputName) {
            case "Andrei":
                return saver;
            case "Hacker":
                String[] cancel = new String[1];
                cancel[0] = "Пошёл вон!";
                return cancel;
            default:
                String[] wrong = new String[1];
                wrong[0] = "Отказано в доступе";
                return wrong;
        }
    }

    public static boolean hold() {
        return false;
    }
}



