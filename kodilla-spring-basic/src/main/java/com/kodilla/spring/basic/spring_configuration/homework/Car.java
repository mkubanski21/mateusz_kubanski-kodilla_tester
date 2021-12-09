package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

    default boolean hasHeadlightsTurnedOn(LocalTime time) {
        if (time.isAfter(LocalTime.of(20,0)) || time.isBefore(LocalTime.of(6,0))) {
            return true;
        }
        return false;
    }

    String getCarType();
}
