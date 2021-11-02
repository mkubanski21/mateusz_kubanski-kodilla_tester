package com.kodilla.abstracts.homework;

public abstract class Job {

    private String responsibilities;
    private int salary;

    public Job(String responsibilities, int salary){
        this.responsibilities = responsibilities;
        this.salary = salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public int getSalary() {
        return salary;
    }

    public abstract void showResponsibilities();
}
