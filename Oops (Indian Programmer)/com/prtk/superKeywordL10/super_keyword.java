//LECTURE 10
package com.prtk.superKeywordL10;
class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    void printcolor(){
        System.out.println(color);    //color of dog class
        System.out.println(super.color);       //color of animal(parent) class
    }
}
public class super_keyword {
    public static void main(String[] args) {
    Dog obj = new Dog();
    obj.printcolor();
    }
}
