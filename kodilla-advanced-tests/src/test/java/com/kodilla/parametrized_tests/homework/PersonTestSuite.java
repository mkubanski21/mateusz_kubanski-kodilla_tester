package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonDataSource#provideDataForTestingBMI")
    public void shouldAssessIfBMIIsCorrect(double height, double weight, String result) {
        assertEquals(result, new Person(height, weight).getBMI());
    }
}