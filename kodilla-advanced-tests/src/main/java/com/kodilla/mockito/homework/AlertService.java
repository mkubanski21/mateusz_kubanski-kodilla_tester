package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlertService {

    private Set<Location> locations = new HashSet<>();
    private Map<PersonInterface, Set<Location>> personToLocations = new HashMap<>();


    public void addPersonToLocation(PersonInterface person, Location location) {
        locations.add(location);
        personToLocations.put(person, locations);
    }


    public void sendAlert(Location location, Alert alert) {
        for(Map.Entry<PersonInterface, Set<Location>> i : personToLocations.entrySet()) {
            if(i.getValue().contains(location))
                i.getKey().receive(alert);
        }
    }
}
