package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    private CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLengthWhenNoTransaction() {
        assertEquals(0, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldHaveZeroSaldoWhenNoTransaction() {
        assertEquals(0, cashMachine.getSaldo());
    }

    @Test
    public void shouldAddThreeTransactionsToArray() {
        cashMachine.add(600);
        cashMachine.add(-200);
        cashMachine.add(400);
        assertEquals(3, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldCalculateCorrectSaldo() {
        cashMachine.add(1060.5);
        cashMachine.add(-500);
        cashMachine.add(550.5);
        cashMachine.add(0);
        assertEquals(1111, cashMachine.getSaldo());
    }

    @Test
    public void shouldAddTwoTransactionsToArrayAndSkipTrirdEqualToZero() {
        cashMachine.add(600);
        cashMachine.add(-200);
        cashMachine.add(0);
        assertEquals(2, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldCalculateCorrectNumberOfWithdrawalsWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        cashMachine.add(600);
        cashMachine.add(-200);
        cashMachine.add(-100);
        cashMachine.add(0);
        assertEquals(2, cashMachine.getNumberOfWithrawals());
    }

    @Test
    public void shouldHaveZeroWithdrawalsWhenNoTransactions() {
        assertEquals(0, cashMachine.getNumberOfWithrawals());
    }

    @Test
    public void shouldCalculateCorrectNumberOfDepositsWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        cashMachine.add(600);
        cashMachine.add(400);
        cashMachine.add(-200);
        cashMachine.add(0);
        assertEquals(2, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldHaveZeroDepositsWhenNoTransactions() {
        assertEquals(0, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldCalculateCorrectValueOfWithdrawalsWhenThereArePositiveNegativeAndTransactionsEqualToZerZero() {
        cashMachine.add(600);
        cashMachine.add(-200);
        cashMachine.add(-100);
        cashMachine.add(0);
        assertEquals(-300, cashMachine.getValueOfWithdrawals());
    }

    @Test
    public void shouldHaveZeroValueOfWithdrawalsWhenNoTransactions() {
        assertEquals(0, cashMachine.getValueOfWithdrawals());
    }

    @Test
    public void shouldCalculateCorrectValueOfDepositsWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        cashMachine.add(600);
        cashMachine.add(400);
        cashMachine.add(-200);
        cashMachine.add(0);
        assertEquals(1000, cashMachine.getValueOfDeposits());
    }

    @Test
    public void shouldHaveZeroValueOfDepositsWhenNoTransactions() {
        assertEquals(0, cashMachine.getValueOfDeposits());
    }
}
