package com.arvind.basics;

public class Strings {

    public static void demo(){

        String name = "arvind";
        String sameName = "arvind";

        String newName = new String("arvind");

        // System.out.println(name + " " + newName + " "+ sameName);
        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(sameName));
        System.out.println(System.identityHashCode(newName));

        System.out.println(name==sameName);
        System.out.println(name==newName);
    }
    
}
