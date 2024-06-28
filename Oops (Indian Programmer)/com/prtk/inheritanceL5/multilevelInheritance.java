//Lecture 7
package com.prtk.inheritanceL5;
class A {
    void methodA(){
        System.out.println("Method of A class");
    }
}
class B extends A{
    void methodB(){
        System.out.println("Method of B class");
    }
}
class C extends B {         //indirectly C is also extending to A via B
    void methodC(){
        System.out.println("Method of C class");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodC();
        obj.methodB();     //class B accessed
        obj.methodA();    //class A(grandparent) accessed
    }
}
