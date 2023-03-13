package com.hillel.lonzhansky.lessons.lesson13.bad.obstacle;

import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Cat;
//import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Dog;
import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Elephant;
import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Fish;

public class ObstaclePool {

    public void start(Cat cat) {
        System.out.println(cat.getName() + " start swim");
    }

//    public void start(Dog dog) {
//        System.out.println(dog.getName() + " start swim");
//    }

    public void start(Fish fish) {
        System.out.println(fish.getName() + " start swim");
    }

    public void start(Elephant elephant) {
    }
}
