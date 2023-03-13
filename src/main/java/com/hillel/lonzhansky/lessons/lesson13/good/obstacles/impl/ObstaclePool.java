package com.hillel.lonzhansky.lessons.lesson13.good.obstacles.impl;

import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Cat;
import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Elephant;
import com.hillel.lonzhansky.lessons.lesson13.bad.participants.Fish;
import com.hillel.lonzhansky.lessons.lesson13.good.obstacles.Obstacle;
import com.hillel.lonzhansky.lessons.lesson13.good.participants.Participant;

public class ObstaclePool implements Obstacle {

    @Override
    public void start(Participant participant) {
        participant.swim();
    }
}
