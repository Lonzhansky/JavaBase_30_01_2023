package com.hillel.lonzhansky.lessons.lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person den = new Person("Den", 28);
        Person den2 = new Person("Den", 28);






//        System.out.println(den.name);
//        System.out.println(den.age);






//        den.name = "Den";
//        den.age = 28;

//        den.demo();

//        if (den.name != null) {
//            den.name.equals("Den");
//        }
//
//        System.out.println(den.name);
//        System.out.println(den.age);
//
//
//        Person person = new Person();
//        person = null;
//        demoNPE(person);
//
//
//        den.sayHello();
//        System.out.println(den.getAge());
//
//        den.increaseAge();
//        System.out.println(den.age);


//        Person alex = new Person();
//        alex.name = "Alex";
//        alex.age = 33;
//
//        alex.demo();
//
//
//        System.out.println(alex.name);
//        System.out.println(den.name);
    }


    static void demoNPE(Person person) {
        if (person != null) {
            person.sayHello();
        }
    }
}
