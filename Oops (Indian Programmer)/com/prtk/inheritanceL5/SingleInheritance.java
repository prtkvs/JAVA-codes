package com.prtk.inheritanceL5;
class Vehicle{
    double price;
    double mileage;
    String color;
    void display(){
        System.out.println("Price is "+ price);
        System.out.println("Mileage is "+ mileage);
        System.out.println("Color is "+ color);
    }
}

class Car extends Vehicle{
    String brand;
    String ftype;
    boolean sunroof;
}
public class SingleInheritance {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.price = 1500000;
        car1.mileage= 18.2;
        car1.color = "Red";
        car1.sunroof = true;
        car1.ftype= "Diesel";
        car1.brand= "Maruti";
        car1.display();
        System.out.println(car1.sunroof);
    }
}
