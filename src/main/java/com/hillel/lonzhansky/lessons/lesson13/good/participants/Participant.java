package com.hillel.lonzhansky.lessons.lesson13.good.participants;

public abstract class Participant {

    String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void swim();

    public abstract void run();
}
