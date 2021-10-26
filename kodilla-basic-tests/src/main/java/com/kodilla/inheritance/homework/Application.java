package com.kodilla.inheritance.homework;

public class Application {
    public static void main (String[] Args) {
        Windows98 windows98 = new Windows98(1998);
        System.out.println("System was released in " + windows98.getYearOfRelease() + ".");
        windows98.turnOn();
        windows98.turnOff();
        System.out.println();
        Windows10 windows10 = new Windows10(2015);
        System.out.println("System was released in " + windows10.getYearOfRelease() + ".");
        windows10.turnOn();
        windows10.turnOff();
    }
}
