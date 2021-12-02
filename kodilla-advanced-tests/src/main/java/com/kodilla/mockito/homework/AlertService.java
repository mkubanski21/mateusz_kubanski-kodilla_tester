package com.kodilla.mockito.homework;

import java.util.*;

public class AlertService {

    private Map<Location, Set<Person>> personToLocations = new HashMap<>();

    public void addPersonToLocation(Person person, Location location) {
        if(personToLocations.containsKey(location)) {
            personToLocations.get(location).add(person);
        }
        else {
            Set<Person> persons = new HashSet<>();
            persons.add(person);
            personToLocations.put(location,persons);
        }
    }

    public void sendAlert(Location location, Alert alert) {
        if(personToLocations.containsKey(location)) {
            personToLocations.get(location).forEach(person -> person.receive(alert));
        }
    }

    public void sendGeneralAlert(Alert alert) {
        Collection<Set<Person>> values = personToLocations.values();
        Set<Person> uniquePersons = new HashSet<>();
        values.forEach(persons -> uniquePersons.addAll(persons));
        uniquePersons.forEach(uniquePerson -> uniquePerson.receive(alert));
    }

    public void removePersonFromLocation(Person person, Location location) {
        if(personToLocations.containsKey(location)) {
            personToLocations.get(location).remove(person);
        }
    }

    public void removePersonFromAllLocations(Person person) {
        Collection<Set<Person>> values = personToLocations.values();
        for(Set<Person> value : values) {
            Iterator<Person> iterator = value.iterator();
            while(iterator.hasNext()) {
                Person personToRemove = iterator.next();
                if(personToRemove.equals(person))
                    iterator.remove();
            }
        }
    }

    public void removeLocation(Location location) {
        personToLocations.remove(location);
    }
}
