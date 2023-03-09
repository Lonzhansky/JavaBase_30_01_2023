package com.hillel.lonzhansky.lessons.lesson12.statics;

public class Person {

    int nonStaticVariable = 0;
    static int age;

    static int counter = 0;


    public Person() {
        counter++;
    }

    static void demoStaticMethod() {
        System.out.println("Person 1");
        System.out.println(age);
    }


}
