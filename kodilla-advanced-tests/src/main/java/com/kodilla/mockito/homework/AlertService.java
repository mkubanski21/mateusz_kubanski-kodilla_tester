package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AlertService {

    private Map<Person, Set<Location>> personToLocations = new HashMap<>();

    public void addPersonToLocation(Person person, Location location) {
        Set<Location> locations = person.add(location);
        personToLocations.put(person, locations);
    }

    public void sendAlert(Location location, Alert alert) {
        for (Map.Entry<Person, Set<Location>> i : personToLocations.entrySet()) {
            if (i.getValue().contains(location))
                i.getKey().receive(alert);
        }
    }

    public void sendGeneralAlert(Alert alert) {
        for (Map.Entry<Person, Set<Location>> i : personToLocations.entrySet()) {
            if (i.getValue().size() >= 1)
                i.getKey().receive(alert);
        }
    }

    public void removePersonFromLocation(Person person, Location location) {
        Set<Location> locations = person.remove(location);
        personToLocations.put(person, locations);
    }

    public void removePersonFromAllLocations(Person person) {
        Set<Location> locations = person.removeAllLocations();
        personToLocations.put(person, locations);
    }

    public void removeLocation(Location location) {
        for (Map.Entry<Person, Set<Location>> i : personToLocations.entrySet()) {
            i.getValue().remove(location);
        }
    }
}
