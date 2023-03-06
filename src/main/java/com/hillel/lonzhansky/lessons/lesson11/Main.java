package com.hillel.lonzhansky.lessons.lesson11;

public class Main {
    public static void main(String[] args) {

        CarElectric tesla = new CarElectric("Tesla model S");
//        System.out.println(tesla.getModelName());
        tesla.setPowerStatus(10);
        System.out.println(tesla.getPowerStatus());
//        tesla.powerStatus = 10;


        tesla.start();
//        tesla.startElectronic();
//        tesla.checkPowerStatus();
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//
//        CarPetrol bmw = new CarPetrol("BMW X5");
//        bmw.fuelStatus = 50;
//
//        bmw.start();
//        bmw.checkFuelStatus();

    }
}
