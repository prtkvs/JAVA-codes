package com.prtk.constructorsL3;

//LECTURE 3
class ABC{
    String name;
    int age;

    public ABC(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("this is runned succesfully");
    }
}

public class constructordemo {
    public static void main(String[] args) {
        ABC obj = new ABC("Sunny",32);
    }
}
