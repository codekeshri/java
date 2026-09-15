package com.arvind.basics.constructor;

public class Student {
    private String name;
    private int age;

    // default constructor
    Student(){}

    // parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student student){
        this.name = student.name;
        this.age = student.age;
    }
}
