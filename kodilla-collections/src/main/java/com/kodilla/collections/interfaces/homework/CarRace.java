package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car opel = new Opel();
        doRace(opel);

        Car ford = new Ford();
        doRace(ford);

        Car audi = new Audi();
        doRace(audi);
    }

    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
