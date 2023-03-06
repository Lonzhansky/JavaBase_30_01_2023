package com.hillel.lonzhansky.lessons.lesson11;

public class Car {

    private final String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public void start() {
        startElectronic();
        startFuelSystem();
        startGPS();
        System.out.println(modelName + " start");
    }

    void stop() {
        System.out.println(modelName + " start");
    }

    private void startElectronic() {
        System.out.println("startElectronic");
    }

    private void startFuelSystem() {
        System.out.println("startFuelSystem");
    }

    private void startGPS() {
        System.out.println("startGPS");
    }

    public String getModelName() {
        return modelName;
    }

}
