//LECTURE-11
package com.prtk.inheritanceL5;
class P{
    public void printP(){
        System.out.println("Class P method");
    }
}
class Q extends P{
    public void printQ(){
        System.out.println("Class Q method");
    }
}
class R extends P{
    public void printR(){
        System.out.println("Class R method");
    }
}
public class hierarchical_inheritance {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.printP();
        R obj1 = new R();
        obj1.printP();
    }
}
