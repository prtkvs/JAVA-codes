package com.prtk.L1;

//LECTURE 1
public class oops1 {
    //prime example of class and objects (we already studied):-
    //Scanner in = new Scanner(System.in);  Scanner= class; in = reference variable ; new= keyword;Scanner(); = constructors. 
    //int n = in.nextInt(); //accessing  //System.in & nextInt(); are functions that required to take inputs from functions
    String name;
    int rno;
    public void printdata(){
        System.out.println(name);                 //accesing objects through functions
        System.out.println(rno);                  //any function called inside class = method
    }
    
    public static void main(String[] args) {
        oops1 std1 = new oops1();
        std1.name = "Ram";
        std1.rno = 34;
        std1.printdata();
        std1.name = "ram";            //since, mutable
        System.out.println(std1.name);
        oops1 std2 = new oops1();
        std2.name= "Rahul";
        std2.rno = 22;
        std2.printdata();
    }
}
