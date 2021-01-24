package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + ": new task from " + taskQueue.getStudentName());
        ++updateCount;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}
