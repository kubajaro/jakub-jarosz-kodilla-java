package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
