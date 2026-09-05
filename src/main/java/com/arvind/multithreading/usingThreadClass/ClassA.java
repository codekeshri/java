package com.arvind.multithreading.usingThreadClass;

public class ClassA extends Thread{
    public static void main(String[] args) {

    }

    @Override
    public void run() {
        System.out.println("Thread is running");

        for(int i=1; i<=5; i++){
            System.out.println(i);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
