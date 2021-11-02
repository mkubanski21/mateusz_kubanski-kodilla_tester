package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private double radius;
    final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double surfaceArea() {
        return PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }
}
