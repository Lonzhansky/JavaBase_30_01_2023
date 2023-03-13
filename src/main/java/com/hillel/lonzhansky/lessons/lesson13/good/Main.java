package com.hillel.lonzhansky.lessons.lesson13.good;

import com.hillel.lonzhansky.lessons.lesson13.good.obstacles.Obstacle;
import com.hillel.lonzhansky.lessons.lesson13.good.obstacles.impl.ObstaclePool;
import com.hillel.lonzhansky.lessons.lesson13.good.obstacles.impl.ObstacleTrack;
import com.hillel.lonzhansky.lessons.lesson13.good.participants.Participant;
import com.hillel.lonzhansky.lessons.lesson13.good.participants.impl.Cat;
//import com.hillel.lonzhansky.lessons.lesson13.good.participants.impl.Dog;
import com.hillel.lonzhansky.lessons.lesson13.good.participants.impl.Dog;
import com.hillel.lonzhansky.lessons.lesson13.good.participants.impl.Elephant;
//import com.hillel.lonzhansky.lessons.lesson13.good.participants.impl.Fish;

public class Main {

    public static void main(String[] args) {


//        ObstaclePool obstaclePool = new ObstaclePool();
//        ObstacleTrack obstacleTrack = new ObstacleTrack();
//
//
//        Cat cat = new Cat("cat1");
////        Dog dog = new Dog("dog1");
//        Fish fish = new Fish("fish1");
//        Elephant elephant = new Elephant("elephant1");
//
//
//        obstaclePool.start(cat);
////        obstaclePool.start(dog);
//        obstaclePool.start(fish);
//        obstaclePool.start(elephant);
//
//        System.out.println();
//        System.out.println();
//
//        obstacleTrack.start(cat);
////        obstacleTrack.start(dog);
//        obstacleTrack.start(fish);
//        obstacleTrack.start(elephant);


        Participant[] participants = {
                new Cat("cat1"),
//                new Fish("fish1"),
                new Elephant("elephant1"),
                new Dog("dog1")
        };

        Obstacle[] obstacles = {
                new ObstaclePool(),
                new ObstacleTrack()
        };


        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }



    }
}
