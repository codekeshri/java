package com.arvind.basics;

import java.util.Scanner;

public class Input {

    public static void demo(){

        
            Scanner sc = new Scanner(System.in);
        
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
        
            System.out.println(name + " "+ age);
    }


    
}
