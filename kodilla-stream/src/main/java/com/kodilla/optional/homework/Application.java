package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Marek Kowalski", new Teacher("Andrzej Nowak")));
        students.add(new Student("Paweł Piątek", new Teacher("Marek Kuś")));
        students.add(new Student("Janusz Grabowski", null));
        students.add(new Student("Piotr Kowalewski", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println(student);
        }
    }
}
