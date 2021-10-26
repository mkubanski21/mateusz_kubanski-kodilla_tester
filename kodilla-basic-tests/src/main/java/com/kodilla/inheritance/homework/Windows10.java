package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {

    public Windows10(int yearOfRelease) {
        super(yearOfRelease);
    }

    public void turnOn(){
        System.out.println("System Windows 10 was turned on.");
    }

    public void turnOff(){
        System.out.println("System Windows 10 was turned off.");
    }
}
