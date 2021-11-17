package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Barcelona","Monachium"));
        flights.add(new Flight("Warszawa","Londyn"));
        flights.add(new Flight("Warszawa","Monachium"));
        flights.add(new Flight("Warszawa","Berlin"));
        flights.add(new Flight("Toronto","Frankfurt"));
        flights.add(new Flight("Frankfurt","Toronto"));
        return flights;
    }
}
