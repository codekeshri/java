package com.arvind.multithreading.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class HandleConcurrency {

    private int count = 0;
    private AtomicInteger atomicCount = new AtomicInteger();
    private final ReentrantLock lock = new ReentrantLock();

    // other ways
    private ConcurrentHashMap<String, Integer> mp = new ConcurrentHashMap<>();
    private volatile boolean running = true;

    public static void main(String[] args) {

    }

    void incrementSynchronized(){
        count++;
    }

    void incrementAtomic(){
        atomicCount.incrementAndGet();
    }

    void incrementWithLock(){
        lock.lock();
        try{
            count++;
        }finally {
            lock.unlock();
        }
    }


}
