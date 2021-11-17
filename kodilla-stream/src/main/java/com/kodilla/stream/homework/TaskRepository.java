package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("prepare presentation", LocalDate.of(2021, 11, 12), LocalDate.of(2021, 11, 16)));
        tasks.add(new Task("cook a dinner", LocalDate.of(2021, 11, 18), LocalDate.of(2021, 11, 18)));
        tasks.add(new Task("read a book", LocalDate.of(2021, 11, 15), LocalDate.of(2021, 11, 23)));
        tasks.add(new Task("go to a swimming pool", LocalDate.of(2021, 11, 20), LocalDate.of(2021, 11, 21)));
        return tasks;
    }
}
