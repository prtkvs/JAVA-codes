package com.prtk.superKeywordL10;

class Animal2{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog2 extends Animal2{
    void eat(){
        System.out.println("bread");
    }
    void bark(){
        System.out.println("Bark");
    }
    void work(){
        super.eat();
        eat();
    }
}
public class invokeParentClassMethod {
    public static void main(String[] args) {
        Dog2 d= new Dog2();
        d.work();
    }
}
