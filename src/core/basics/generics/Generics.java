package com.arvind.basics.generics;

public class Generics {

    public static void main(String[] args) {
        GenericsClass gc = new GenericsClass<>();
        boolean a = gc.areEqual(2, 3);
        boolean b = gc.areEqual("arvind", "arvind");
        System.out.println(a + " " + b);

    }
}

class GenericsClass <T>{

    boolean areEqual(T x, T y){
        return x == y;
    }
}
