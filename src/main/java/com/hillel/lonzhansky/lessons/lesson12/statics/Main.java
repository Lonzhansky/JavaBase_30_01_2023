package com.hillel.lonzhansky.lessons.lesson12.statics;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        Person.demoStaticMethod();
//        System.out.println(Person.age);
//
//

        System.out.println("counter = " + Person.counter);
        Person person1 = new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        System.out.println("counter = " + Person.counter);
        new Person();

        System.out.println("counter = " + Person.counter);
//        person1.age = 10;
//        System.out.println();
//        System.out.println();
//        System.out.println(Person.age);
//
//        System.out.println();
//        System.out.println();
//        Person person2 = new Person();
//        System.out.println(person2.age);
//        Person person3 = new Person();
//        System.out.println(person3.age);
//        Person person4 = new Person();
//        System.out.println(person4.age);
//        person4.demoStaticMethod();


        Person.age = 10;


        System.out.println(Person.age);

        Person.age = 20;

        System.out.println(Person.age);

        method1();
        method2();


    }

    static void method1() {
        System.out.println(Person.age);
    }

    static void method2() {
        System.out.println(Person.age);
    }
}
