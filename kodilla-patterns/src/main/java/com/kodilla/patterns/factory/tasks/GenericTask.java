package com.kodilla.patterns.factory.tasks;

abstract public class GenericTask implements Task {

    final private String taskName;
    private boolean isExecuted;

    public GenericTask(String taskName) {
        this.taskName = taskName;
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

    public void setExecuted(boolean executed) {
        isExecuted = executed;
    }

}
