package com.kodilla.bank.homework;

public class Bank {
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;
    private CashMachine cashMachine3;
    private CashMachine[] cashMachines;

    public Bank(){
        this.cashMachine1 = new CashMachine();
        this.cashMachine2 = new CashMachine();
        this.cashMachine3 = new CashMachine();
        this.cashMachines = new CashMachine[] {cashMachine1, cashMachine2, cashMachine3};

    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }


    public void addTransactionToCashMachine1(double transaction) {
            this.cashMachine1.add(transaction);
    }

    public void addTransactionToCashMachine2(double transaction) {
            this.cashMachine2.add(transaction);
    }

    public void addTransactionToCashMachine3(double transaction) {
            this.cashMachine3.add(transaction);
    }

    public double getOverallSaldo() {
        double overallSaldo = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            overallSaldo += this.cashMachines[i].getSaldo();
        }
        return overallSaldo;
    }

    public int getOverallNumberOfWithrawals() {
        int numberOfWithdrawals = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            numberOfWithdrawals += this.cashMachines[i].getNumberOfWithrawals();
        }
        return numberOfWithdrawals;
    }

    public int getOverallNumberOfDeposits() {
        int numberOfDeposits = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            numberOfDeposits += this.cashMachines[i].getNumberOfDeposits();
        }
        return numberOfDeposits;
    }

    public double getOverallAverageWithdrawal() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getValueOfWithdrawals();
            count += this.cashMachines[i].getNumberOfWithrawals();
        }
        if (sum == 0 || count == 0) {
            return 0;
        }
        return sum / count;
    }

    public double getOverallAverageDeposit() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i].getValueOfDeposits();
            count += this.cashMachines[i].getNumberOfDeposits();
        }
        if (sum == 0 || count == 0) {
            return 0;
        }
        return sum / count;
    }
}

