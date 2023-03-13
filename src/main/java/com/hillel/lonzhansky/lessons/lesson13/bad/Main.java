package com.hillel.lonzhansky.lessons.lesson13.bad;

import com.hillel.lonzhansky.lessons.lesson13.bad.obstacle.ObstaclePool;
import com.hillel.lonzhansky.lessons.lesson13.bad.obstacle.ObstacleTrack;
import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Cat;
//import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Dog;
import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Elephant;
import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Fish;

import javax.swing.text.Element;

public class Main {
    public static void main(String[] args) {

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleTrack obstacleTrack = new ObstacleTrack();


        Cat cat = new Cat("cat1");
//        Dog dog = new Dog("dog1");
        Fish fish = new Fish("fish1");
        Elephant elephant = new Elephant("elephant1");


        obstaclePool.start(cat);
//        obstaclePool.start(dog);
        obstaclePool.start(fish);
        obstaclePool.start(elephant);

        System.out.println();
        System.out.println();

        obstacleTrack.start(cat);
//        obstacleTrack.start(dog);
        obstacleTrack.start(fish);
        obstacleTrack.start(elephant);


    }
}
