package com.hillel.lonzhansky.lessons.lesson10;

public class Car {

    String model;
    double statusFuel;
    boolean isStart;

    public Car(String model, double statusFuel) {
        this.model = model;
        if (statusFuel < 0) {
            this.statusFuel = 0;
        } else {
            this.statusFuel = statusFuel;
        }
    }

    void start() {
        if (!isStart) {
            isStart = true;
            System.out.println("Машина " + model + " заведена");
        } else {
            System.out.println("Машина " + model + " вже заведена!!!!!!!!!");
        }
    }

    void stop() {
        if (isStart) {
            System.out.println("Машина " + model + " заглушена");
            isStart = false;
        } else {
            System.out.println("Машина " + model + " не заведена!!!!!!!!!");
        }
    }

    void drive() {
        if (isStart) {
            if (statusFuel <= 0.5) {
                System.out.println("Недостатньо палива");
            } else {
                System.out.println(model + " їде");
                statusFuel -= 0.5;
                System.out.println("Кількість палива = " + statusFuel);
            }
        } else {
            System.out.println(model + " не заведена");
        }
    }


}
