package com.arvind.basics;

public class Inheritance {

    public static void demo(){

        Car car = new Car();
        car.start();
    }

    
}

class Gaddi {

    int wheelsCount;
    String model;

    Gaddi(){
        System.out.println("Gaddi constructor");
    }

    Gaddi(int x){
        this.wheelsCount = x;
        System.out.println("parameterized Gaddi constructor");
    }

    void start(){
        System.out.println("start parent");
    }

}

class Car extends Gaddi{

    Car(){
        super(3);
        System.out.println("Car constructor");
    }

    void start(){
        super.start();
        System.out.println("start child");
    }
}

/**
 * super is used to refer immediate parent class
 * final keyword with variable cannot be changed
 * final keyword with method cannot be overridden
 * final keyword with class cannot be extended
*/

