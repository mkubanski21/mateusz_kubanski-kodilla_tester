package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "School";
    private static final String DESCRIPTION = "Learn for math exam";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(LISTNAME);

        //Then
        Assertions.assertEquals(1, readTaskLists.size());

        //Clear
        int id = readTaskLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
