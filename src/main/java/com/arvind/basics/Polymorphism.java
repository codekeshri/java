package com.arvind.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Polymorphism {
    
    public static void main(String[] args) {
        
        Data d = new ChildData();
        d.printData();

        List<Integer> l2 = new ArrayList<>();
        List<Integer> l1 = new LinkedList<>();
        Queue<Integer> l3 = new LinkedList<>();
        
    }
    
}

/**
 * There are two types of polymorphism - at runtime and at compile time
 * runtime polymorphism- method overriding
 * compiletime polymorphism - method overloading
 */

class Data {
    int data;

    public void printData(){}
}

class ChildData extends Data {
    
    @Override
    public void printData(){
        System.out.println(data);
    }

    void call(){}
}