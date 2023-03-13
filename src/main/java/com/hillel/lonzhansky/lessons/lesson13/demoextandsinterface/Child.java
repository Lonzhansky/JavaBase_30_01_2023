package com.hillel.lonzhansky.lessons.lesson13.demoextandsinterface;

public interface Child extends Interface1, Interface2 {

    @Override
    default void someMethod() {
        Interface1.super.someMethod();
        Interface2.super.someMethod();

//        System.out.println("my default");
    }
}
