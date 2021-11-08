package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private int speed;
    private int increaseValue;

    public Opel(int increaseValue) {
        this.speed = 0;
        this.increaseValue = increaseValue;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += increaseValue;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 20;
    }
}
