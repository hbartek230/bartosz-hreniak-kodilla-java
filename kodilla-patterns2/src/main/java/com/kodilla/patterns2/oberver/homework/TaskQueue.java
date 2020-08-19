package com.kodilla.patterns2.oberver.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable{
    private final List<Observer> observers;
    private final List<String> tasksList;
    private final String userTaskListName;

    public TaskQueue(String userTaskListName) {
        observers = new ArrayList<>();
        tasksList = new ArrayList<>();
        this.userTaskListName = userTaskListName;
    }

    public void addTask(String taskName) {
        tasksList.add(taskName);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasksList() {
        return tasksList;
    }

    public String getUserTaskListName() {
        return userTaskListName;
    }
}
