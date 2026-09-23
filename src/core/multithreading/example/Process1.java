package com.arvind.multithreading.example;

public class Process1 implements Runnable {
    public static void main(String[] args) {

    }

    @Override
    public void run(){
        for(int i=0; ; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

}
