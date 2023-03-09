package com.hillel.lonzhansky.lessons.lesson12.main;

public class Main {
    public static void main(String[] args) {


//        Cat cat = new Cat("Barsik", 5);
//        System.out.println(cat.toString());


//        Animal cat = new Cat("Barsik", 5);
//
//        System.out.println(cat);
//
//        cat.sayHello();
//        ((Cat) cat).jump();


//        Animal animal = new Animal("Animal", 1);
//        Dog dog = new Dog("Dog", 1, false);
//        Cat cat = new Cat("Cat", 1);
//        CatChild cat2 = new CatChild("CatChild", 1);
//
//        demo(animal);
//        demo(dog);
//        demo(cat);
//        demo(cat2);


//        Animal[] animals = {
//                new Animal("Animal", 1),
//                new Dog("Dog", 1, false),
//                new Cat("Cat", 1),
//                new CatChild("CatChild", 1)
//        };
//
//        for (Animal animal : animals) {
//            animal.sayHello();
//        }


    }

    static void demo(Animal animal) {
        animal.sayHello();

//        if (animal instanceof Cat) {
//            ((Cat) animal).jump();
//        }

        if (animal.getClass() == Dog.class) {
            ((Dog) animal).run();
        }

    }

}
