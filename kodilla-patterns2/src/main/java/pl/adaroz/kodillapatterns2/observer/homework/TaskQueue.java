package pl.adaroz.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {

    private final String studentName;
    private final List<Observer> observers;
    private final List<Task> tasks;

    public TaskQueue(String studentName) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }


}
