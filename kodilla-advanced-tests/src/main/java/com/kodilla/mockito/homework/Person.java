package com.kodilla.mockito.homework;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private Set<Location> locations = new HashSet<>();
    private int i =0;

    public int receive(Alert alert) {
        this.i ++;
        return i;
    }

    public Set<Location> add(Location location) {
        this.locations.add(location);
        return locations;
    }

    public Set<Location> remove(Location location) {
        this.locations.remove(location);
        return locations;
    }

    public Set<Location> removeAllLocations() {
        this.locations.clear();
        return locations;
    }

}
