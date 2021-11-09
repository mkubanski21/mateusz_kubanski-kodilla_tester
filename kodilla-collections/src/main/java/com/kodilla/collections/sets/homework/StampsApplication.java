package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Kraków", 30.5, 20, true));
        stamps.add(new Stamp("Kraków", 30.5, 20, true));
        stamps.add(new Stamp("Kraków", 30.5, 20, true));
        stamps.add(new Stamp("Gdańsk", 17.5, 17.5, false));
        stamps.add(new Stamp("Wrocław", 28, 28, false));
        stamps.add(new Stamp("Gdańsk", 30, 17.5, true));
        stamps.add(new Stamp("Warszawa", 40, 30, true));

        for(Stamp stamp : stamps)
            System.out.println(stamp);

        System.out.println();
        System.out.println("Size of HashSet: " + stamps.size());
    }
}
