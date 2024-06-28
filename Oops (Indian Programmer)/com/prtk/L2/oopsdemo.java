package com.prtk.L2;

//LECTURE 2
class Student{
    final String NAME = "Rahul";  //by convention we use capital letters for final attributes variable
    int rno;
    String address;
}
public class oopsdemo {
    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println(std1.NAME);
//        std1.NAME = "Riya"; error final hai, so immutable
    }
}
