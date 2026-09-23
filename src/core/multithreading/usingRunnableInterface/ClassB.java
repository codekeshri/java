package com.arvind.multithreading.usingRunnableInterface;

import com.arvind.multithreading.usingThreadClass.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        Thread t0 = new Thread(classA);
        t0.start();
        System.out.println("B");
    }
}
