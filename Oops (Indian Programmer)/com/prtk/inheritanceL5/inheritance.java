package com.prtk.inheritanceL5;

//LECTURE 5 (4 was a theory)
class Parent{
    void display(){
        System.out.println("com.prtk.inheritanceL5.Parent Class Method");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("com.prtk.inheritanceL5.Child class Method");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Child child1= new Child();
        child1.display();          //reduced re-usability directly access parent class
        System.out.println();  //break line
        child1.show();
    }
}
