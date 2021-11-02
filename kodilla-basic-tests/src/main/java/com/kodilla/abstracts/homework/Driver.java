package com.kodilla.abstracts.homework;

public class Driver extends Job {

    public Driver(){
        super("driving car, selling tickets.",4500);
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Driver's responsibilities at job: "+getResponsibilities());
    }
}
