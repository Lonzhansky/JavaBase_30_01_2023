package com.hillel.lonzhansky.lessons.lesson13.demoextandsinterface;

public interface Interface2 {

    default void someMethod() {
        System.out.println("Interface2");
    }
}
