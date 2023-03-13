package com.hillel.lonzhansky.lessons.lesson13.main2;

public interface Runnable {

    int distance = 100;

    void run();

    default void defaultMethod() {
        System.out.println("defaultMethod");
    }

}
