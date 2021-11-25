package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonDataSource {
    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(2, 80, "Normal (healthy weight)"),
                Arguments.of(1.61, 90, "Obese Class I (Moderately obese)"),
                Arguments.of(1.7, 190, "Obese Class VI (Hyper Obese)"),
                Arguments.of(1.82, 45, "Very severely underweight"),
                Arguments.of(1.82,-105, "Very severely underweight"),
                Arguments.of(-1.82,105, "Obese Class I (Moderately obese)"),
                Arguments.of(-1.82,-105, "Very severely underweight")
        );
    }
}
