package com.hillel.lonzhansky.lessons.lesson12.main;

public class Dog extends Animal {

    private boolean isHungry;

    public Dog(String name, int age, boolean isHungry) {
        super(name, age);
        this.isHungry = isHungry;
    }

    public void run() {
        System.out.println(name + " run");
    }

    @Override
    public void sayHello() {
        System.out.println("Dog " + name + " say hello");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                ", isHungry=" + isHungry +
                '}';
    }
}
