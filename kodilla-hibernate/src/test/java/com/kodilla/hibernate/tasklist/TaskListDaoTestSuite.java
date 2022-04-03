package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //given
        TaskList taskList = new TaskList("Test list", "Test description");
        taskListDao.save(taskList);
        int taskListId = taskList.getId();

        //when
        String searchedEntry = taskList.getListName();
        List<TaskList> result = taskListDao.findByListName(searchedEntry);

        //then
        assertEquals(1, result.size());

        //cleanUp
        taskListDao.deleteById(taskListId);
    }

    @Test
    void testTaskListDaoSaveWithTasks() {
        //given
        Task task = new Task("Test task 1", 14);
        Task task2 = new Task("Test task 2", 8);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(15), true);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("Listname", "ToDoTask");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //when
        taskListDao.save(taskList);
        int id = taskList.getId();

        //then
        assertNotNull(id);
    }
}
