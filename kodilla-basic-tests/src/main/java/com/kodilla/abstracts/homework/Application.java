package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(8);
        System.out.println("Surface area of square with side equals to "+square.getSideA()+" is "+square.surfaceArea()+".");
        System.out.println("Perimeter of square with side equals to "+square.getSideA()+" is "+square.perimeter()+".");
        System.out.println();

        Rectangular rectangular = new Rectangular(3,8.5);
        System.out.println("Surface area of rectangular with sides equal to "+rectangular.getSideA()+" and "+rectangular.getSideB()+" is "+rectangular.surfaceArea()+".");
        System.out.println("Perimeter of rectangular with sides equal to "+rectangular.getSideA()+" and "+rectangular.getSideB()+" is "+rectangular.perimeter()+".");
        System.out.println();

        Circle circle = new Circle(7.23);
        System.out.println("Surface area of circle with radius equals to "+circle.getRadius()+" is "+circle.surfaceArea()+".");
        System.out.println("Perimeter of circle with radius equals to "+circle.getRadius()+" is "+circle.perimeter()+".");
    }
}
