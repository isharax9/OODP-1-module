/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author isharaLakshitha
 */
class A {

    public void a1() {
        System.out.println("A a1");
    }

    public void a2() {
        System.out.println("A a2");
    }

}

class B {
    public void b1(){
        System.out.println("B b1");
    }
}

class C {
    public void c1(){
        System.out.println("C c1");
    }
}

class X {
    private A a;
    private B b;
    private C c;
    
    public X(){
        a = new A();
        b = new B();
        c = new C();
    }
    
    public void x1(){
        a.a1();
        b.b1();
        a.a2();
        c.c1();
    }
}

class Test { 
    public static void main(String[] args) {
        X x = new X();
        x.x1();
    }
}