package com.arvind.basics;
import java.util.*;

public class Encapsulation {

    public static void main(String[] args) {
        
        List<Integer>list = new ArrayList<>();
        System.out.println(list);

        int x = Math.max(0, 0);
    }
    
}

/**
 * Default - same package,
 * public  - everywhere
 * private - only in class
 * protected - same package + subclass in different package
 * static    - can access without making the object.
 */
