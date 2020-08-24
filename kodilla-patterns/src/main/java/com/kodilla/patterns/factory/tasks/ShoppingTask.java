package com.kodilla.patterns.factory.tasks;

public class ShoppingTask extends GenericTask {

    final private String whatToBuy;
    final private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        super(taskName);
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

}
