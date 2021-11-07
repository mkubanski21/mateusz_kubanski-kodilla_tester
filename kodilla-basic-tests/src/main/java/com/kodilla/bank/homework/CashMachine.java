package com.kodilla.bank.homework;

public class CashMachine {

    private double[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new double[0];
        this.size = 0;
    }

    public void add(double transaction) {
        if (transaction != 0) {
            this.size++;
            double[] newTab = new double[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.size - 1] = transaction;
            this.transactions = newTab;
        }
    }

    public double[] getTransactions() {
        return transactions;
    }

    public double getSaldo() {
        double saldo = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            saldo += this.transactions[i];
        }
        return saldo;
    }

    public int getNumberOfTransactions() {
        return transactions.length;
    }

    public int getNumberOfWithrawals() {
        int numberOfWithdrawal = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                numberOfWithdrawal++;
            }
        }
        return numberOfWithdrawal;
    }

    public int getNumberOfDeposits() {
        int numberOfDeposits = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                numberOfDeposits++;
            }
        }
        return numberOfDeposits;
    }

    public double getValueOfWithdrawals() {
        double valueOfWithdrawals = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                valueOfWithdrawals += this.transactions[i];
            }
        }
        return valueOfWithdrawals;
    }

    public double getValueOfDeposits() {
        double valueOfDeposits = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                valueOfDeposits += this.transactions[i];
            }
        }
        return valueOfDeposits;
    }
}
