package com.prtk.L2;

//LECTURE 2
    class Dog{
    String name;
    public void eat(){
        System.out.println(name+" eats!");
    }
}
public class oops2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name= "Bruno";
        dog.eat();        //Bruno eats!
    }
}
