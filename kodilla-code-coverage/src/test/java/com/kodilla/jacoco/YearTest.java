package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        //given
        Year year = new Year(1600);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4AndNotDivisibleBy100() {
        //given
        Year year = new Year(2012);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfNotDivisibleBy4() {
        //given
        Year year = new Year(2017);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);

    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleBy4And100AndNotDivisibleBy400() {
        //given
        Year year = new Year(1900);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }
}