package org.telran.main.Lesson1.Lesson5.modifirs;

public class TestSamePackage {
    public static int intStatic = 5;
    int intDefault = 1; //не объявляется. Доступен в том же классе и пакете, в котором определен.
    public int intPublic = 2; //доступен во всех классах вашего приложения
    private int intPrivate = 3; //доступен только внутри класса, в котором он определен
    protected int intProtected = 4; // доступен в классе, в котором он определен, и в его подклассах

    public void testMethode() {
        System.out.println("i`m in class TestOther");
        System.out.println(intDefault);
        System.out.println(intPublic);
        System.out.println(intPrivate);
        System.out.println(intProtected);
    }
}
