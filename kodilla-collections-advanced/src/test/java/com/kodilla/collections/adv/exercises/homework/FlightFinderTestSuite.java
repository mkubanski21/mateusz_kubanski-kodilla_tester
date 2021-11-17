package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void findFlightsFromWhenNoResultsExist() {
//        given
        FlightFinder flightFinder = new FlightFinder();
//        when
        flightFinder.findFlightsFrom("Monachium");
//        then
        assertEquals(0, flightFinder.findFlightsFrom("Monachium").size());
    }

    @Test
    public void findFlightsFrom() {
//        given
        FlightFinder flightFinder = new FlightFinder();
//        when
        flightFinder.findFlightsFrom("Warszawa");
//        then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa","Londyn"));
        expectedList.add(new Flight("Warszawa","Monachium"));
        expectedList.add(new Flight("Warszawa","Berlin"));
        assertEquals(expectedList, flightFinder.findFlightsFrom("Warszawa"));
    }

    @Test
    public void findFlightsToWhenNoResultsExist() {
//        given
        FlightFinder flightFinder = new FlightFinder();
//        when
        flightFinder.findFlightsTo("Madryt");
//        then
        assertEquals(0, flightFinder.findFlightsTo("Madryt").size());
    }

    @Test
    public void findFlightsTo() {
//        given
        FlightFinder flightFinder = new FlightFinder();
//        when
        flightFinder.findFlightsTo("Monachium");
//        then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Barcelona","Monachium"));
        expectedList.add(new Flight("Warszawa","Monachium"));
        assertEquals(expectedList, flightFinder.findFlightsTo("Monachium"));
    }
}
