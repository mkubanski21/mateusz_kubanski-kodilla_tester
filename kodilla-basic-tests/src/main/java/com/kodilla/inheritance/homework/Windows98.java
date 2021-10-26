package com.kodilla.inheritance.homework;

public class Windows98 extends OperatingSystem {

    public Windows98(int yearOfRelease) {
        super(yearOfRelease);
    }

    public void turnOn(){
        System.out.println("System Windows 98 was turned on.");
    }

    public void turnOff(){
        System.out.println("System Windows 98 was turned off.");
    }
}
