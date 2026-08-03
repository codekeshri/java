package com.arvind.basics;

import java.util.Scanner;

public class Strings {

    public static void demo(){

        String name = "arvind";
        String sameName = "arvind";
        String newName = new String("arvind");

        System.out.println(name + " " + newName + " "+ sameName);
        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(sameName));
        System.out.println(System.identityHashCode(newName));

        System.out.println(name==sameName);
        System.out.println(name==newName);
        System.out.println(name.equals(newName));

        
    }

    public static void takeInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Your full name is " + firstName + " " + lastName);

    }



/*
    * Popular String Methods:
    * toUpperCase()
    * toLowerCase()
    * trim()
    * startsWith()
    * endsWith()
    * equals()
    * equalsIgnoreCase()
    * charAt()
    * valueOf()
    * replace()
    * contains()
    * substring()
    * split()
    * toCharArray()
    * isEmpty()
 */
    
    public static void caseMethod(){

        String str = "                           arVind ";
        String strUpper = str.toUpperCase().trim();
        String strLower = str.toLowerCase().trim();
        System.out.println(strUpper + " "+ strLower);
        System.out.println("Arvind".startsWith("Ar"));
        System.out.println("Arvind".endsWith("vind"));
        System.out.println("Arvind".equals("Arvind"));
        System.out.println("Arvind".equalsIgnoreCase("arvind"));
        System.out.println("Arvind".charAt(3));
        System.out.println("Arvind".contains("vin"));

        int age = 12;
        String strAge = String.valueOf(age);
        System.out.println(strAge+2);

        String sentence = "I love java as java is a good language";
        String replacedSentence = sentence.replace("java", "js");
        System.out.println(replacedSentence);
        System.out.println(sentence.contains(" "));
        System.out.println("arvindkeshri".substring(5, 9));

        String words[] = sentence.split("a");
        for(String word: words)System.out.println(word);

        // An array of character works same as java array
        String color = "brown";
        char letters[] = color.toCharArray();
        for(char ch: letters)System.out.println(ch);
        System.out.println(color.isEmpty());



    }
}


