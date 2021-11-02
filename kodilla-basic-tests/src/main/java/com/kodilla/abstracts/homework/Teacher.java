package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    public Teacher() {
        super("teaching children, preparing tests.", 3800);
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Teacher's responsibilities at job: " + getResponsibilities());
    }
}