package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    final private String taskName;
    final private String whatToBuy;
    final private double quantity;

    private boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
