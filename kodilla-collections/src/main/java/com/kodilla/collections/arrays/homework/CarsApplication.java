package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarModel = random.nextInt(3);
        int a = random.nextInt(50) + 1;
        int b = random.nextInt(50) + 1;
        int c = random.nextInt(50) + 1;

        if (drawnCarModel == 0)
            return new Audi(a);
        else if (drawnCarModel == 1)
            return new Ford(b);
        else
            return new Opel(c);
    }
}
