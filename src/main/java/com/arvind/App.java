package com.arvind;

import com.arvind.basics.Array;
import com.arvind.basics.Inheritance;
import com.arvind.basics.Input;
import com.arvind.basics.Methods;
import com.arvind.basics.Strings;

public class App {
    public static void main( String[] args ){

        System.out.println("\n\n----------- COMPILED SUCCESSFULLY ----------------------------------------");
        System.out.println("----------- RUNNING CODE NOW ---------------------------------------------\n");

        Input.demo();
        Array.demo();
        Methods.demo();
        System.out.println(Methods.getRandom(34, 90));
        Strings.demo();
        Strings.takeInput();
        Strings.caseMethod();
        Inheritance.demo();
    }
}
