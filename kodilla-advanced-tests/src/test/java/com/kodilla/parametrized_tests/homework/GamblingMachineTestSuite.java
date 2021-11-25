package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    public Set<Integer> convertToSet(String numbers) {
        Set<Integer> setWithNumbers = new HashSet<>();
        for(String number : numbers.split(",")){
            setWithNumbers.add(Integer.parseInt(number));
        }
        return setWithNumbers;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineCorrectData.csv")
    public void shouldAssertTrueForCorrectData(String numbers) throws InvalidNumbersException {
        Set<Integer> userNumbers = convertToSet(numbers);
        int numberOfWins = gamblingMachine.howManyWins(userNumbers);
        assertTrue(numberOfWins >= 0 && numberOfWins <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineIncorrectData.csv")
    public void shouldAssertFalseForIncorrectData_withException(String numbers) {
        Set<Integer> userNumbers = convertToSet(numbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }
}


