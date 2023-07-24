package org.telran.pavel.lesson16Pavel.task.sub_task;

public class SubTest {

    public boolean access = true;
    private String hiddenField = "I was hide with private modifier";

    public String getHiddenField() {
        if (access) {
            return hiddenField;
        } else {
            return "You shall not pass";
        }
    }

    public void setHiddenField(String hiddenField) {
        if (hiddenField.length() > 15) {
            this.hiddenField = hiddenField;
        } else {
            System.out.println("Строка должна быть не менее 15 символов в длину");
        }
    }
}
