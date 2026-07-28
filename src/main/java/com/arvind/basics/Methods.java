package com.arvind.basics;

public class Methods {

    public static void demo(){

        int a = 5;
        int b = 6;

        System.out.println(Math.pow(2, a));
        System.out.println(Math.min(a, b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.abs(a));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.ceil(a));
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));
        System.out.println(Math.round(a));
        System.out.println(Math.random());
    }

    public static int getRandom(int a, int b){

        return (int)(Math.random()*(b-a+1) + a);
    }
    
}
