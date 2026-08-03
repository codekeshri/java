package com.arvind.basics;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        
        // Wrapper Class
        ArrayList<Integer> a = new ArrayList<>();

        Integer b = Integer.valueOf(9);
        Integer c = Integer.valueOf("12");
        Boolean flag = Boolean.valueOf("true");

        System.out.println(b + " " + c + " " + flag);

    }
    
}

// Generics class
class GenericsClass<T> {
    private T data;

    public GenericsClass(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}

class GenericsMethod {

    public static void main(String[] args) {

        GenericsMethod obj = new GenericsMethod();
        obj.doubleData("112");
        obj.doubleData(123);
        
    }

    static <E> void printData(E data){}

    <E> void doubleData(E data){}
}