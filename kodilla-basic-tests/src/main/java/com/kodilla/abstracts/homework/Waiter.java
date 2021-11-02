package com.kodilla.abstracts.homework;

public class Waiter extends Job {

    public Waiter(){
        super("take care of guests, deliver food and drinks.",3500);
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Waiter's responsibilities at job: "+getResponsibilities());
    }
}
