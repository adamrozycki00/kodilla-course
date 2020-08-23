package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    final private String taskName;
    final private String where;
    final private String using;

    private boolean isExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName + " is being executed");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

}
