package com.hillel.lonzhansky.lessons.lesson11;

public class CarDiesel extends Car {

    double dieselStatus;

    public CarDiesel(String modelName) {
        super(modelName);
    }

    void checkFuelStatus() {
        System.out.println("diesel status = " + dieselStatus);
    }


    @Override
    public void stop() {
        super.stop();
    }
}
