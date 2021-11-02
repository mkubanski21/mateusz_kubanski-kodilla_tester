package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    private String firstName = "Iwona";
    private int age = 40;
    private String job = "teacher";


    public Teacher() {
        super("teaching children, preparing tests.", 3800);
    }

    @Override
    public void showResponsibilities() {
        System.out.println(firstName + " is " + age + " years old and is a " + job + ". " + "Responsibilities in job: " + getResponsibilities());
    }
}