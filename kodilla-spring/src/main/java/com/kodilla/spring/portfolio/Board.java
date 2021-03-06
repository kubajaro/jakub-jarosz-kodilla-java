package com.kodilla.spring.portfolio;


public final class Board {
    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addToDoTask(String task) {
        toDoList.getTasks().add(task);
    }

    public void addInProgressTask(String task) {
        inProgressList.getTasks().add(task);
    }

    public void addDoneTask(String task) {
        doneList.getTasks().add(task);
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
