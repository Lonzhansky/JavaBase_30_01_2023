package com.hillel.lonzhansky.lessons.lesson12.main;

public class Animal {

    protected String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sayHello() {
        System.out.println("Animal say Hello");
    }


    public final void sayGoodBy() {
        System.out.println(name + " say Good By");
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
