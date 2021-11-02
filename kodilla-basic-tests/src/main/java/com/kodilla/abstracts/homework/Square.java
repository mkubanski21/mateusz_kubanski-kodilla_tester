package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private double sideA;
    public Square(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public double surfaceArea() {
        return sideA*sideA;
    }

    @Override
    public double perimeter() {
        return 4*sideA;
    }
}
