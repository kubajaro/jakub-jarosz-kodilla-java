package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLIST")
public class TaskList {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;

    @NotNull
    @Column(name = "LISTNAME")
    private String listName;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Task> tasks = new ArrayList<>();

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
