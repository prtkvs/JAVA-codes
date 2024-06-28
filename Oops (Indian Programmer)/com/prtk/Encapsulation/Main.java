package com.prtk.Encapsulation;
class Student{
    private String name;
    private int age;
    private float marks;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public float getMarks(){
        return marks;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setMarks(float marks){
        this.marks= marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
//        System.out.println(obj.name);//null, if private can't be accessed outside class
        obj.setName("Rahul");
        obj.setAge(17);
        obj.setMarks(99.3f);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getMarks());
    }
}
