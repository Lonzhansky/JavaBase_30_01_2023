package com.hillel.lonzhansky.lessons.lesson11;

public class CarPetrol extends Car {

    double fuelStatus;

    public CarPetrol(String modelName) {
        super(modelName);
    }

    void checkFuelStatus() {
        System.out.println("fuel status = " + fuelStatus);
    }

}
