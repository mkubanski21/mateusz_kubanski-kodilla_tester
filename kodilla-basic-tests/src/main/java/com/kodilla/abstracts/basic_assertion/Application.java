package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        int substractResult = calculator.substract(a,b);
        int raiseToPowerResult = calculator.raiseTo2Power(a);

        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        boolean correctSubstract = ResultChecker.assertEquals(-3, substractResult);
        boolean correctRaiseToPower = ResultChecker.assertEquals(25, raiseToPowerResult);

        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctSubstract) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctRaiseToPower) {
            System.out.println("Metoda RaiseTo2Power działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda RaiseTo2Power nie działa poprawnie dla liczby " + a);
        }
    }
}
