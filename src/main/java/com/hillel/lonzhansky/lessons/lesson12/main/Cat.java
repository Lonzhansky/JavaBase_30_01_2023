package com.hillel.lonzhansky.lessons.lesson12.main;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void jump() {
        System.out.println(name + " jump");
    }

    @Override
    public void sayHello() {
        System.out.println("Cat " + name + " say hello");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "age='" + getAge() + '\'' +
                '}';
    }
}
