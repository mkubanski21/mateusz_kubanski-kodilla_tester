package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfRelease;

    public OperatingSystem(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void turnOn(){
        System.out.println("System was turn on");
    }

    public void turnOff(){
        System.out.println("System was turn off");
    }
}
