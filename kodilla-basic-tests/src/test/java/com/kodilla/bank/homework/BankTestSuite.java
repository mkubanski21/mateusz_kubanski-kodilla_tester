package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private Bank bank = new Bank();

    @Test
    public void shouldCalculateCorrectOverallSaldoWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        bank.addTransactionToCashMachine1(100);
        bank.addTransactionToCashMachine1(200);
        bank.addTransactionToCashMachine1(-200);
        bank.addTransactionToCashMachine2(0);
        bank.addTransactionToCashMachine2(-50);
        bank.addTransactionToCashMachine3(50.5);
        bank.addTransactionToCashMachine3(100);
        assertEquals(200.5, bank.getOverallSaldo());
    }

    @Test
    public void shouldHaveSaldoEqualsToZeroWhenNoTransactions() {
        assertEquals(0, bank.getOverallSaldo());
    }

    @Test
    public void shouldCalculateCorrectNumberOfOverallWithdrawalsWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        bank.addTransactionToCashMachine1(800);
        bank.addTransactionToCashMachine1(-800);
        bank.addTransactionToCashMachine1(200.8);
        bank.addTransactionToCashMachine2(0);
        bank.addTransactionToCashMachine2(-80);
        bank.addTransactionToCashMachine3(0);
        bank.addTransactionToCashMachine3(170);
        assertEquals(2, bank.getOverallNumberOfWithrawals());
    }

    @Test
    public void shouldHaveZeroOverallWithdrawalsWhenNoTransactions() {
        assertEquals(0, bank.getOverallNumberOfWithrawals());
    }

    @Test
    public void shouldCalculateCorrectNumberOfOverallDepositsWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        bank.addTransactionToCashMachine1(800);
        bank.addTransactionToCashMachine1(-800);
        bank.addTransactionToCashMachine1(200.8);
        bank.addTransactionToCashMachine2(0);
        bank.addTransactionToCashMachine2(-80);
        bank.addTransactionToCashMachine3(0.85);
        bank.addTransactionToCashMachine3(170);
        assertEquals(4, bank.getOverallNumberOfDeposits());
    }

    @Test
    public void shouldHaveZeroOverallDepositsWhenNoTransactions() {
        assertEquals(0, bank.getOverallNumberOfDeposits());
    }

    @Test
    public void shouldCalculateCorrectOverallAverageWithdrawalWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        bank.addTransactionToCashMachine1(300);
        bank.addTransactionToCashMachine1(-500);
        bank.addTransactionToCashMachine1(200.8);
        bank.addTransactionToCashMachine2(0);
        bank.addTransactionToCashMachine2(-80);
        bank.addTransactionToCashMachine3(-10.85);
        bank.addTransactionToCashMachine3(-170);
        assertEquals(-190.21, bank.getOverallAverageWithdrawal(),0.01);
    }

    @Test
    public void shouldHaveOverallAverageWithdrawalEqualToZeroWhenNoTransactions() {
        assertEquals(0, bank.getOverallAverageWithdrawal());
    }

    @Test
    public void shouldCalculateCorrectOverallAverageDepositsWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        bank.addTransactionToCashMachine1(500);
        bank.addTransactionToCashMachine1(-500);
        bank.addTransactionToCashMachine1(200.8);
        bank.addTransactionToCashMachine2(0);
        bank.addTransactionToCashMachine2(-80);
        bank.addTransactionToCashMachine3(-10.85);
        bank.addTransactionToCashMachine3(170);
        assertEquals(290.27, bank.getOverallAverageDeposit(),0.01);
    }

    @Test
    public void shouldHaveOverallAverageDepositsEqualToZeroWhenNoTransactions() {
        assertEquals(0, bank.getOverallAverageDeposit());
    }
}
