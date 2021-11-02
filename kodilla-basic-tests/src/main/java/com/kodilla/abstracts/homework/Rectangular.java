package com.kodilla.abstracts.homework;

public class Rectangular extends Shape {

    private double sideA;
    private double sideB;

    public Rectangular(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double surfaceArea() {
        return sideA*sideB;
    }

    @Override
    public double perimeter() {
        return 2*sideA+2*sideB;
    }
}
