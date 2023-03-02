package com.hillel.lonzhansky.lessons.lesson10;

import java.util.Objects;

public class Person {

    String name;

    String lastName;

    String city;
    int age;

//    public Person(String name, String lastName) {
//        this.name = name;
//        this.lastName = lastName;
//    }

//    public Person(String lastName, String city) {
//        this.lastName = lastName;
//        this.city = city;
//    }


    //    public Person() {
//    }

//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person(int age) {
//        this.age = age;
//    }
//
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//
//    Person(int age, String name) {
//        this.name = name;
//        this.age = age;
//    }

    void sayHello() {
        System.out.println(name + " say hello");
    }

    public int getAge() {
        return age;
    }

    void increaseAge() {
        age++;
    }

    void demo() {
        String name = "xxx";
        System.out.println(this.name);
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}
