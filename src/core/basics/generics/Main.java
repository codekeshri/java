package com.arvind.basics.generics;

public class Main {
    public static void main(String[] args) {
//        GenericsClass<String> gc = new GenericsClass<>();
        GenericMethods gc = new GenericMethods();
        boolean a = gc.areEqual(2, 3);
        boolean b = gc.areEqual("arvind", "arvind");
        System.out.println(a + " " + b);
    }
}



