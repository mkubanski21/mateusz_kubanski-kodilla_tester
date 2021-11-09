package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(20));
        cars.add(new Ford(30));
        cars.add(new Opel(45));
        cars.add(new Opel(8));
        cars.add(new Audi(12));
        cars.add(new Audi(52));


        for (Car car : cars)
            CarUtils.describeCar(car);

        cars.remove(0);
        cars.remove(new Audi(52));

        System.out.println();
        System.out.println("Elements of ArrayList after removing:");
        System.out.println();

        for (Car car : cars)
            CarUtils.describeCar(car);

        System.out.println("----------------");
        System.out.println("Size of ArrayList: " + cars.size());
    }
}
