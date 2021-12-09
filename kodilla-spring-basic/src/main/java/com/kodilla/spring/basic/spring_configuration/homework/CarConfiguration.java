package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Configuration
public class CarConfiguration {

    @Bean
    public Car createNewCar() {
        Car car;
        List<String> seasons = Arrays.asList("Spring", "Summer", "Autumn", "Winter");
        Random generator = new Random();
        int index = generator.nextInt(4);
        String season = seasons.get(index);
        if (season.equals("Summer")) {
            car = new Cabrio();
        } else if (season.equals("Spring") || season.equals("Autumn")) {
            car = new Sedan();
        } else {
            car = new SUV();
        }
        return car;
    }

}
