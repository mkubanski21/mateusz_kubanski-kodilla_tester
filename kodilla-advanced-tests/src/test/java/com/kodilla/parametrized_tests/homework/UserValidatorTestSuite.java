package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Ab._-2", "ab23TT."})
    public void shouldReturnTrueForCorrectUsernames(String username) {
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "ab", "ATg/s37,", "ab2 3TT. "})
    public void shouldReturnFalseForIncorrectUsernames(String username) {
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfusernameIsEmpty(String username) {
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"jan.kowalski@gmail.comcom", "_jan7._kOWALski22-@inte77RIa.interia1.p", "23231@-.a"})
    public void shouldReturnTrueForCorrectEmail(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"jan.kowalski.gmail.com", "_jan7._kOWALski22-@inte77RIa.interia1.comcom1", "_jan7._kOWALski22-@inte77RIa.interia1.com1"})
    public void shouldReturnFalseFoIncorrectEmail(String email) {
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfEmailIsEmpty(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String email) {
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }
}
