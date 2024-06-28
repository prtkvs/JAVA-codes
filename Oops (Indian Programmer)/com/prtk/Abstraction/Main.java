package com.prtk.Abstraction;
abstract class Car{
   abstract public void fueltype();
   public void color(){
        System.out.println("Black Color");
    }
}
class Tata extends Car{
    @Override
    public void fueltype() {
        System.out.println("Diesel");
    }
}
public class Main {
    public static void main(String[] args) {
        Tata Nexon = new Tata();
        Nexon.fueltype();
        Nexon.color();
    }
}
