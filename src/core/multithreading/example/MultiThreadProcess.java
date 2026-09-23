package com.arvind.multithreading.example;

public class MultiThreadProcess {

    public static void main(String[] args) {

        Process1 process1 = new Process1();
        Thread t0 = new Thread(process1);  // new
        t0.start(); // runnable   other states - running, blocked, waiting, terminated

        for(int i=0; ; i++){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
