package com.arvind.multithreading.usingRunnableInterface;

public class ClassA extends ClassB implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}

/* Here we cannot use Thread class to extend classA as multiple inheritance
   is not allowed in Java.
   Hence, we will have to use Runnable interface here.
* */