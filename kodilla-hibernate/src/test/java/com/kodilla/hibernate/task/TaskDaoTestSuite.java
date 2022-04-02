package com.kodilla.hibernate.task;


import com.kodilla.hibernate.task.dao.TaskDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);

        //When
        taskDao.save(task);

        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        taskDao.deleteById(id);
    }

    @Test
    void testTaskDaoFindByDuration() {
        //given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();

        //when
        List<Task> result = taskDao.findByDuration(7);

        //then
        assertNotNull(result);
    }

    @Test
    void testTaskDaoSaveWithFinancialDetails() {
        //given
        Task task = new Task(DESCRIPTION, 10);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(12), false));

        //when
        taskDao.save(task);
        int id = task.getId();

        //then
        //assertEquals(17, id);
    }
}
