package com.prtk.InterfaceL9;
interface Car{
    public void start();
}
class ElectricCar implements Car{
    @Override
    public void start() {
        System.out.println("Electric Car Starts");
    }
}
class DieselCar implements Car{
    @Override
    public void start() {
        System.out.println("Diesel Car Starts");
    }
}

public class interfacedemo {
    public static void main(String[] args) {
        Car obj1 = new ElectricCar();
        obj1.start();
        Car obj2 = new DieselCar();
        obj2.start();
    }
}
