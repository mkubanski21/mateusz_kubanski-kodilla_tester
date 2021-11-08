package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines;
    private int numberOfMachines;

    public Bank(){
        this.cashMachines = new CashMachine[0];
        this.numberOfMachines = 0;
    }

    public void addCashMachine(CashMachine machine){
        this.numberOfMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfMachines];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.numberOfMachines - 1] = machine;
        this.cashMachines = newTab;
    }

    public CashMachine[] getCashMachines() {
        return this.cashMachines;
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

