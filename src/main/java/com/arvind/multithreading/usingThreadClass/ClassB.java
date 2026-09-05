package com.arvind.multithreading.usingThreadClass;

public class ClassB {
    public static void main(String[] args) throws InterruptedException {
        ClassA thread1 = new ClassA();
        thread1.start();
        thread1.join();
        System.out.println("Finished");
    }
}
