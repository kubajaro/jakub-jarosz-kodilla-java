package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TasksFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //given
        TasksFactory tasksFactory = new TasksFactory();

        //when
        Tasks shoppingTask = tasksFactory.createTask(TasksFactory.SHOPPING_TASK);
        shoppingTask.executeTask();

        //then
        assertEquals("Shopping task", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //given
        TasksFactory tasksFactory = new TasksFactory();

        //when
        Tasks shoppingTask = tasksFactory.createTask(TasksFactory.DRIVING_TASK);
        shoppingTask.executeTask();

        //then
        assertEquals("Driving task", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //given
        TasksFactory tasksFactory = new TasksFactory();

        //when
        Tasks shoppingTask = tasksFactory.createTask(TasksFactory.PAINTING_TASK);
        shoppingTask.executeTask();

        //then
        assertEquals("Painting task", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }
}
