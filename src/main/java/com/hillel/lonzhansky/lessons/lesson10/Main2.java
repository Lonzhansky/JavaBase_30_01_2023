package com.hillel.lonzhansky.lessons.lesson10;

public class Main2 {
    public static void main(String[] args) {

        Car car = new Car("BMW", -50);

        car.start();
        car.drive();

        car.stop();
        car.drive();

    }
}
