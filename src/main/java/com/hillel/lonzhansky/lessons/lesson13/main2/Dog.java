package com.hillel.lonzhansky.lessons.lesson13.main2;

public class Dog implements Swimmable, Runnable {

    @Override
    public void swim() {
        System.out.println("Dog swim");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }

    @Override
    public void defaultMethod() {
        System.out.println("my default Method");
    }
}
