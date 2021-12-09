package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarConfigurationTestSuite {

    @Test
    public void shouldCreateCarBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createNewCar");
        String carType = car.getCarType();
        System.out.println(carType);
        List<String> possibleCarTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        assertTrue(possibleCarTypes.contains(carType));
    }

    @Test
    public void shouldHaveHeadlightsTurnedOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createNewCar");
        boolean result = car.hasHeadlightsTurnedOn(LocalTime.of(1,15));
        assertTrue(result);
    }

    @Test
    public void shouldHaveHeadlightsTurnedOff() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createNewCar");
        boolean result = car.hasHeadlightsTurnedOn(LocalTime.of(13,0));
        assertFalse(result);
    }
}