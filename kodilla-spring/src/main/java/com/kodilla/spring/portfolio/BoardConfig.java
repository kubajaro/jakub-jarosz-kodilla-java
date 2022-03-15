package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

public class BoardConfig {

    @Autowired
    @Qualifier("toDo")
    TaskList toDoList;

    @Autowired
    @Qualifier("inProgress")
    TaskList inProgressList;

    @Autowired
    @Qualifier("done")
    TaskList doneList;

    @Bean
    public Board getList() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getToDoList() {
        List<String> tasks = new ArrayList<>();
        tasks.add("1");
        return new TaskList(tasks);
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        List<String> inProgressList= new ArrayList<>();
        inProgressList.add("2");
        return new TaskList(inProgressList);
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getDoneList() {
        List<String> doneList = new ArrayList<>();
        doneList.add("3");
        return new TaskList(doneList);
    }
}
