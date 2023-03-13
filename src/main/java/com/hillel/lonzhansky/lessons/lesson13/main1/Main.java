package com.hillel.lonzhansky.lessons.lesson13.main1;

public class Main {

    public static void main(String[] args) {
//        Car.Engine engine = new Car.Engine(5.5);


//        Car car = new Car(5.5, 20);
//        System.out.println(car.engine);
//        System.out.println(car.wheels);
//        System.out.println(car.door);
//
//        System.out.println();
//
//        System.out.println(car.getModel());
//
//
//        car.demo();
//
//        car.engine.isStart = false;
//
//
//        Car.Door door = new Car.Door();
//        door.rollDown();



        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void abstractMethod() {
                System.out.println("qweqweqweqweqw");
            }
        };

        abstractClass.abstractMethod();

    }
}
