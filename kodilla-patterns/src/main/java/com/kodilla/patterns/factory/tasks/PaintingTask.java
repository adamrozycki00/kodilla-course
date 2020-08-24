package com.kodilla.patterns.factory.tasks;

public class PaintingTask extends GenericTask {

    final private String color;
    final private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        super(taskName);
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

}
