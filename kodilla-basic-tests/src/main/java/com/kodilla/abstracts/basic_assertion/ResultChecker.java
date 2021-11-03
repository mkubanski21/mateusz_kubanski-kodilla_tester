package com.kodilla.abstracts.basic_assertion;

public class ResultChecker {
    public static boolean assertEquals (double expected, double actual, double delta){
        return (expected + delta >= actual) && (expected - delta <= actual);
    }
}
