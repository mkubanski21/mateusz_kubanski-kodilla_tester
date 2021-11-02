package com.kodilla.abstracts.homework;

public class Person {

    public void process(Job job) {
        job.showResponsibilities();
    }

    public static void main(String[] args) {

        Job driver = new Driver();
        Job waiter = new Waiter();
        Job teacher = new Teacher();

        Person processor = new Person();
        processor.process(driver);
        processor.process(waiter);
        processor.process(teacher);
    }
}
