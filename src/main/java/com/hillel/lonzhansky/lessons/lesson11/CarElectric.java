package com.hillel.lonzhansky.lessons.lesson11;


public class CarElectric extends Car {

    private double powerStatus;


    public CarElectric(String modelName) {
        super(modelName);
    }

    public CarElectric(String modelName, double powerStatus) {
        super(modelName);
        this.powerStatus = powerStatus;
    }

    void checkPowerStatus() {
        System.out.println("power status = " + powerStatus);
    }

    @Override
    public void start() {
        super.start();
        System.out.println(getModelName() + " start, power status = " + powerStatus);
    }

    public double getPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(double powerStatus) {
        this.powerStatus = powerStatus;
    }


}
