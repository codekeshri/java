package com.arvind.multithreading;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getPriority() + " " + Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {

        Thread lowPriorityThread = new MyThread("low-thread");
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        Thread mediumPriorityThread = new MyThread("medium-thread");
        mediumPriorityThread.setPriority(Thread.NORM_PRIORITY);
        Thread highPriorityThread = new MyThread("high-thread");
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.start();
        mediumPriorityThread.start();
        highPriorityThread.start();

    }
}
