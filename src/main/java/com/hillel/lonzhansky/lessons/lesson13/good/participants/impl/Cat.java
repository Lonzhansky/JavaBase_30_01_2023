package com.hillel.lonzhansky.lessons.lesson13.good.participants.impl;

import com.hillel.lonzhansky.lessons.lesson13.good.participants.Participant;

public class Cat extends Participant {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " start swim");
    }

    @Override
    public void run() {
        System.out.println(getName() + " start run");
    }
}
