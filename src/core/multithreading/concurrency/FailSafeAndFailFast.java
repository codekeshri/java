package com.arvind.multithreading.concurrency;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeAndFailFast {
    public static void main(String[] args) {

        // Fail Fast - It will throw ConcurrentModification exception
        List<Integer> list = new ArrayList<>(List.of(1,2, 3));
        for(Integer i: list){
//            list.add(4);
        }

        // Fail Safe
        List<Integer> list1 = new CopyOnWriteArrayList<>(List.of(1, 2, 3));
        for(Integer i: list1){
            list1.add(4);
        }

        for(Integer i: list1) System.out.println(i);
    }
}
