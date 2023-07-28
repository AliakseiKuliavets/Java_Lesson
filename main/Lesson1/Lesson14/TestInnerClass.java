package org.telran.main.Lesson1.Lesson14;

public class TestInnerClass {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.open();

        Zoo.Monkey monkey = zoo.new Monkey();
        monkey.eatFood();

        Zoo.Monkey.Banana banana = monkey.new Banana();
        Zoo.Monkey.Banana banana1 = zoo.new Monkey().new Banana();
        Zoo.Monkey.Banana banana2 = new Zoo().new Monkey().new Banana();

        banana.getInfo();
        banana1.getInfo();
        banana2.getInfo();
    }
}

class Zoo {
    int count = 10;

    private String phone = "419532456";
    void open() {
        System.out.println("Open from 9 to 17" + (new Monkey()).name);
    }

    class Monkey {
        String name = "AkunaMatata";

        void eatFood() {
            System.out.println("Monkey eat and smile" + count);

            class Tail {
                int lenght = 4;

                String runHelp() {
                    return (lenght > 3) ? "Help with tail " : "Not use tail ";
                }
            }
            System.out.println(new Tail().runHelp());
        }

        class Banana {
            String color = "Yellow";

            String getColor() {
                return color;
            }

            void getInfo() {
                System.out.println("Animals name " + name + " Eating banana " + color);
            }
        }
    }
}
