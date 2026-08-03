package com.arvind.basics;

/**
 * Abstract keyword
 * interfaces
 * inner class & nested static classes
 * anoymous classes
 * functional interfaces
 * lambda expressions
 * 
 * abstract class cannot be instantiated
 * Similar to abstract classes interfaces helps in achieving abstraction in java
 * Inside interface all variables are by default public static final
 * 
 */

public class Abstraction {

    public static void main(String[] args) {

        Vehicle v1 = new Motor();
        Animal a1 = new Animal() {

            public void eats() {
            };

            public void walk() {
            };
        };

        System.out.println(Animal.LEGS);

    }

}

abstract class Vehicle {

    abstract void accelerate();

    abstract void brake();

    public void run() {
    };

}

class Motor extends Vehicle {

    public void accelerate() {
    };

    public void brake() {
    };
}

interface Animal {

    int LEGS = 4;

    void eats();

    void walk();

    default void run() {
    }
}

interface Cattle {
    public static final int legs = 4;

    abstract public void eats();

    abstract public void walk();
}

class Monkey implements Animal, Cattle {
    public void eats() {
    }

    public void walk() {
    }
}

/**
 * Inner Class
 */

class InnerClass {
    class Toy {
        int price;
    }

    static class Playstation {
        int price;
    }

    public static void main(String[] args) {
        Toy toy = new InnerClass().new Toy();
        toy.price = 45;

        Playstation playstation = new Playstation();
        InnerClass.Playstation playstation2 = new InnerClass.Playstation();
    }
}
