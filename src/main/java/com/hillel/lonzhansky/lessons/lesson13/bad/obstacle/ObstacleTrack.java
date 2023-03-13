package com.hillel.lonzhansky.lessons.lesson13.bad.obstacle;

import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Cat;
//import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Dog;
import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Elephant;
import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Fish;

public class ObstacleTrack {

    public void start(Cat cat) {
        System.out.println(cat.getName() + " start run");
    }

//    public void start(Dog dog) {
//        System.out.println(dog.getName() + " start run");
//    }

    public void start(Fish fish) {
        System.out.println(fish.getName() + " cant run");
    }

    public void start(Elephant elephant) {
    }
}
