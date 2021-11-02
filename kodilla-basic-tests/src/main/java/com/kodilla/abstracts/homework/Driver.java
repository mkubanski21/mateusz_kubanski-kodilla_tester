package com.kodilla.abstracts.homework;

public class Driver extends Job {

    private String firstName = "Anna";
    private int age = 28;
    private String job = "driver";


    public Driver(){
        super("driving car, selling tickets.",4500);
    }

    @Override
    public void showResponsibilities() {
        System.out.println(firstName+" is "+age+" years old and is a "+job+ ". "+"Responsibilities in job: "+getResponsibilities());
    }
}
