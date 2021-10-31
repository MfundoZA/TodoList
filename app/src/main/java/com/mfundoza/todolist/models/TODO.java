package com.mfundoza.todolist.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class TODO {
    private int id;
    private String task;
    private String description;
    private Priority priority;
    private LocalDate date;
    private LocalTime time;

    public TODO(String task) {
        this.task = task;
    }

    public TODO(int id, String task, String description, Priority priority, LocalDate date, LocalTime time) {
        this.id = id;
        this.task = task;
        this.description = description;
        this.priority = priority;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
