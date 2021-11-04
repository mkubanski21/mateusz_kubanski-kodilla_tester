package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void process() {
        job.showResponsibilities();
    }

    public static void main(String[] args) {

      Job driver = new Driver();
      Job waiter = new Waiter();
      Job teacher = new Teacher();

      Person processor = new Person("Piotr", 22,driver);
      Person processor2 = new Person("Anna", 32,waiter);
      Person processor3 = new Person("Karol", 30, teacher);

      processor.process();
      processor2.process();
      processor3.process();
    }
}
