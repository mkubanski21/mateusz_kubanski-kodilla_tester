package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 15;
        int b = 8;
        int substractResult = calculator.substract(a,b);
        assertEquals(7, substractResult);
    }

    @Test
    public void testRaiseTo2Power() {
        Calculator calculator = new Calculator();
//        test case for positive value
        double a = 3;
        double raiseTo2PowerResult = calculator.raiseTo2Power(a);
        assertEquals(9,raiseTo2PowerResult,0.1 );
//        test case for negative value
        double b = -3;
        double raiseTo2PowerResult2 = calculator.raiseTo2Power(b);
        assertEquals(9,raiseTo2PowerResult2,0.1 );
//        test case for value equals to 0
        double c = 0;
        double raiseTo2PowerResult3 = calculator.raiseTo2Power(c);
        assertEquals(0,raiseTo2PowerResult3,0.1 );
    }
}
