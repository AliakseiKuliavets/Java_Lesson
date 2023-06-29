package org.telran.Lesson5.modifirs;

import org.telran.Lesson4.Test;
import org.telran.Lesson5.modifirs.otherPakage.TestOther;

public class TestModifiers {
    public static void main(String[] args) {

        // 1. test other в дргой директории
        System.out.println(TestOther.intStatic); // получения доступа к static

        TestOther testOtherPackage = new TestOther();
        testOtherPackage.testMethode();
        System.out.println(testOtherPackage.intPublic);

        // 2. testSamePackage  в одной и той жже директории
        System.out.println(TestSamePackage.intStatic); // получения доступа к static

        TestSamePackage testSamePackage = new TestSamePackage();
        testSamePackage.testMethode();
        System.out.println(testSamePackage.intDefault);
        System.out.println(testSamePackage.intProtected);
        System.out.println(testSamePackage.intPublic);

    }
}
