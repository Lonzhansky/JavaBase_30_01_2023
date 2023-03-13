package com.hillel.lonzhansky.lessons.lesson13.demoextandsinterface;

public interface Interface1 {

    default void someMethod() {
        System.out.println("Interface1");
    }
}
