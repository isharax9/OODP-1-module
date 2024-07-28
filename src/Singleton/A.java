/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author isharaLakshitha
 */
public class A {

    private static A a;

    private A() {

    }

    public static A getA() {
        if (a == null) {
            a = new A();
        }
        return a;
    }
}

class Test {

    public static void main(String[] args) {
        A a1 = A.getA();
        A a2 = A.getA();

        System.out.println("a1==a2");
    }
}
