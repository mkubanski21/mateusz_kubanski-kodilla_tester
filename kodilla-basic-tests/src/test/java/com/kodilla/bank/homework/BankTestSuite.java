package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private Bank bank = new Bank();

    private CashMachine machine1 = new CashMachine();
    private CashMachine machine2 = new CashMachine();
    private CashMachine machine3 = new CashMachine();

    @Test
    public void shouldHaveZeroLengthWhenNoMachinesAdded() {
        assertEquals(0, bank.getCashMachines().length);
    }

    @Test
    public void shouldAddThreeMachinesToArray() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        assertEquals(3, bank.getCashMachines().length);
    }

    @Test
    public void shouldCalculateCorrectOverallSaldoWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        machine1.add(100);
        machine1.add(200);
        machine1.add(-200);
        machine2.add(0);
        machine2.add(-50);
        machine3.add(50.5);
        machine3.add(100);
        assertEquals(200.5, bank.getOverallSaldo());
    }

    @Test
    public void shouldHaveSaldoEqualsToZeroWhenNoTransactions() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        assertEquals(0, bank.getOverallSaldo());
    }

    @Test
    public void shouldCalculateCorrectNumberOfOverallWithdrawalsWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        machine1.add(800);
        machine1.add(-800);
        machine1.add(200.8);
        machine2.add(0);
        machine2.add(-80);
        machine3.add(0);
        machine3.add(170);
        assertEquals(2, bank.getOverallNumberOfWithrawals());
    }

    @Test
    public void shouldHaveZeroOverallWithdrawalsWhenNoTransactions() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        assertEquals(0, bank.getOverallNumberOfWithrawals());
    }

    @Test
    public void shouldCalculateCorrectNumberOfOverallDepositsWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        machine1.add(800);
        machine1.add(-800);
        machine1.add(200.8);
        machine2.add(0);
        machine2.add(-80);
        machine3.add(0.85);
        machine3.add(170);
        assertEquals(4, bank.getOverallNumberOfDeposits());
    }

    @Test
    public void shouldHaveZeroOverallDepositsWhenNoTransactions() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        assertEquals(0, bank.getOverallNumberOfDeposits());
    }

    @Test
    public void shouldCalculateCorrectOverallAverageWithdrawalWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        machine1.add(300);
        machine1.add(-500);
        machine1.add(200.8);
        machine2.add(0);
        machine2.add(-80);
        machine3.add(-10.85);
        machine3.add(-170);
        assertEquals(-190.21, bank.getOverallAverageWithdrawal(),0.01);
    }

    @Test
    public void shouldHaveOverallAverageWithdrawalEqualToZeroWhenNoTransactions() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        assertEquals(0, bank.getOverallAverageWithdrawal());
    }

    @Test
    public void shouldCalculateCorrectOverallAverageDepositsWhenThereArePositiveNegativeAndTransactionsEqualToZero() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        machine1.add(500);
        machine1.add(-500);
        machine1.add(200.8);
        machine2.add(0);
        machine2.add(-80);
        machine3.add(-10.85);
        machine3.add(170);
        assertEquals(290.27, bank.getOverallAverageDeposit(),0.01);
    }

    @Test
    public void shouldHaveOverallAverageDepositsEqualToZeroWhenNoTransactions() {
        bank.addCashMachine(machine1);
        bank.addCashMachine(machine2);
        bank.addCashMachine(machine3);
        assertEquals(0, bank.getOverallAverageDeposit());
    }
}
