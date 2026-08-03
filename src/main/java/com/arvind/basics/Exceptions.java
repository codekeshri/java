package com.arvind.basics;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        
        int a[] = new int[5];
        
        try{

            int result = 5/0;
            System.out.println(a[8]);

        }catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){

            System.out.println(e);

        }catch(RuntimeException e){
            
            System.out.println(e);
        }

        // Handle all exceptions
        try{

            int result = 5/0;
            System.out.println(a[8]);

        }catch(Exception e){

            System.out.println(e);
        }

        try {
            getNumberFromArray(a);
            
        } catch (Exception e) {
            
        }

        System.out.println("Arvind is great");
    }

    static int getNumberFromArray(int a[]) throws ArithmeticException{
        return a[8];
    }
    
}

/**
 * An exception can occur due to following reasons:
 * Invalid user input
 * Device failure
 * Loss of network connection
 * Out of disk memory
 * code errors
 * opening an unavailable file
 * 
 * There are two types of exceptions:
 * Runtime Exception:
 *  - NullPointerException
 *  - Out of bounds array exception
 *  - Dividing a number by 0 - ArithmeticException
 * 
 * IO Exception:
 * checked exception or compile time exception - FileNotFoundException
 */

class CustomExceptions {
    public static void main(String[] args) throws MyException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        sc.close();
        if(age > 100){
            throw new MyException();
        }

    }
}

class MyException extends Exception{

}
