package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void printTask() {
        List<String> tempList;

       System.out.println("To do list: ");
       tempList = initiateList(toDoList);
       printTasks(tempList);

       System.out.println("In progress list: ");
       tempList = initiateList(inProgressList);
       printTasks(tempList);

       System.out.println("Done list: ");
       tempList = initiateList(doneList);
       printTasks(tempList);
    }

    private void printTasks(List<String> taskList) {
        System.out.println("Task list: ");
        for(String task: taskList){
            System.out.println(task);
        }
    }

    private List<String> initiateList(TaskList task) {
        return task.getTasks();
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
